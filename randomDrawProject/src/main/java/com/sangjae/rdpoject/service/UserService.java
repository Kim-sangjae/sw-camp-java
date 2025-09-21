package com.sangjae.rdpoject.service;

import com.sangjae.rdpoject.domain.User;
import com.sangjae.rdpoject.domain.UserRole;
import com.sangjae.rdpoject.repository.UserRepository;

import java.util.List;

import static com.sangjae.rdpoject.domain.UserRole.*;

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUser() {
        return userRepository.selectAllUser();
    }


    //
    public User loginUser(String id, String pw) {
        User checkUser = userRepository.selectOneUserId(id);
        if (checkUser == null) {
            throw new IllegalArgumentException("존재하지 않는 아이디입니다.");
        }
        if (!checkUser.getUserPassword().equals(pw)) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }

        if(checkUser.getUserRole() != USER){
            throw new IllegalArgumentException("관리자는 9988 메뉴를 이용해주세요.");
        }
        return checkUser;
    }


    public User loginAdmin(String id, String pw) {
        User checkUser = userRepository.selectOneUserId(id);
        if (checkUser == null) {
            throw new IllegalArgumentException("존재하지 않는 아이디입니다.");
        }
        if (!checkUser.getUserPassword().equals(pw)) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        if(checkUser.getUserRole() != ADMIN){
            throw new IllegalArgumentException("관리자 정보가 없습니다.");
        }
        return checkUser;
    }

    //
    public void joinUser(User user) {
        if (isDuplicateUserId(user.getUserId())) {
            throw new IllegalArgumentException("이미 존재하는 아이디입니다.");
        }

        if(isDuplicateUserPhoneNumber(user.getPhoneNumber())){
            throw new IllegalArgumentException("이미 존재하는 번호 입니다");
        }

        if(validatePhone(user.getPhoneNumber())){
            throw new IllegalArgumentException("전화번호는 '-' 를 제외한 11자리를 입력해주세요");
        }

        if (validatePw(user.getUserPassword())) {
            throw new IllegalArgumentException("비밀번호는 1~8자리여야 합니다.");
        }
        userRepository.insertUser(user);
    }

    //
    public void updateUser(User currentUser, String inputPw, String newId, String newPw, String newPhone) {
        if (!currentUser.getUserPassword().equals(inputPw)) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }

        if(!(currentUser.getUserId().equals(newId))) {
            boolean check = isDuplicateUserId(newId);
            if(check){
                throw new IllegalArgumentException("이미 존재하는 아이디입니다.");
            }
        }

        if(!(currentUser.getPhoneNumber().equals(newPhone))) {
            boolean check = isDuplicateUserPhoneNumber(newPhone);
            if(check){
                throw new IllegalArgumentException("이미 존재하는 번호 입니다");
            }
        }

        if(validatePhone(newPhone)){
            throw new IllegalArgumentException("전화번호는 '-' 를 제외한 11자리를 입력해주세요");
        }

        if (validatePw(newPw)) {
            throw new IllegalArgumentException("비밀번호는 1~8자리여야 합니다.");
        }

        User updatedUser = new User(currentUser.getUserCode(), newId, newPw, newPhone,currentUser.getUserRole(), currentUser.getMoney());
        userRepository.modifyUser(updatedUser);
    }


    //
    public void deleteUser(User user) {
        userRepository.deleteUser(user);
    }


    //
    public void chargeMoney(User user, int money) {

        if (money % 500 != 0) {
            throw new IllegalArgumentException("충전 금액은 500원 단위로 입력해주세요.");
        }

        userRepository.updateUserMoney(user, money);
    }

    //
    public User findByPhonNum(String phonNum){

        User findUser = userRepository.findUserByPhone(phonNum);

        if(findUser==null){
            throw new IllegalArgumentException("입력하신 번호의 회원정보가 없습니다.");
        }
        return findUser;
    }




    // 검증 로직
    // 아이디 중복
    private boolean isDuplicateUserId(String userId) {
        return userRepository.selectAllUser().stream()
                .anyMatch(u -> u.getUserId().equals(userId));
    }

    // 전화번호 중복
    private boolean isDuplicateUserPhoneNumber(String phone){
        return userRepository.selectAllUser().stream().anyMatch(u -> u.getPhoneNumber().equals(phone));
    }



    // 전화번호 검증
    private boolean validatePhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) return true; // 비어있으면 invalid

        String trimmed = phone.trim();

        if (trimmed.length() != 11) return true;

        return false;
    }

    // 비밀번호 검증
    private boolean validatePw(String pw) {
        if (pw == null || pw.isEmpty()) return true;
        if (pw.length() > 8) return true;
        return false;
    }
}
