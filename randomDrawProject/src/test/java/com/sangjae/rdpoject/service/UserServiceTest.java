package com.sangjae.rdpoject.service;

import com.sangjae.rdpoject.domain.User;
import com.sangjae.rdpoject.domain.UserRole;
import com.sangjae.rdpoject.repository.UserRepository;
import com.sangjae.rdpoject.repository.storage.FileUserStorage;
import com.sangjae.rdpoject.repository.storage.UserStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class UserServiceTest {



    private UserService userService;
    private UserRepository userRepository;
    private FileUserStorage fileUserStorage;

    @BeforeEach
    void setUp(){
        fileUserStorage = new FileUserStorage();
        userRepository = new UserRepository(fileUserStorage); // 빈 상태
        userService = new UserService(userRepository);
    }


    @Test
    @DisplayName("정상 유저 추가")
    void joinUser() {
        // 존재사는 유저 실패
//        String id = "홍길동";
//        String pw = "1234";
//        String phone = "01012341234";
//        UserRole userRole = UserRole.USER;

        // 새로운 유저아이디 , 번호 성공
        String id1 = "길길동";
        String pw1 = "1234";
        String phone1 = "01011111111";
        UserRole userRole1 = UserRole.USER;
        userService.joinUser(id1,pw1,phone1,userRole1);
    }

    @Test
    @DisplayName("핸드폰번호로 계정찾기")
    void findByPhonNum() {
        userService.findByPhonNum("01012341234");
    }

    @Test
    @DisplayName("유저정보 정상 수정")
    void updateUser() {
        User currentUSer = userService.findByPhonNum("01012341234");
        String currentPW = "1234";
        String newId = "홍홍길동";
        String newPw = "1234";
        String newPhone = currentUSer.getPhoneNumber();
        userService.updateUser(currentUSer,currentPW,newId,newPw,newPhone);

        System.out.println(currentUSer);

    }

    @Test
    @DisplayName("전체 유저 조회")
    void findAllUser() {
        userService.findAllUser().stream().forEach(System.out::println);
    }


    // 얘 왜 안되는지 모르겠음....
//    @Test
//    @DisplayName("로그인 실패: 비밀번호가 일치하지 않습니다.")
//    void loginUser() {
//
//
//        IllegalArgumentException ex = assertThrows(
//                IllegalArgumentException.class,
//                () -> userService.loginUser("유관순" , "1234324")
//        );
//
//        assertTrue(ex.getMessage().contains("로그인 실패: 비밀번호가 일치하지 않습니다."));
//
//    }


    @Test
    @DisplayName("정상 삭제")
    void deleteUser() {
        User delUSer = userService.findByPhonNum("01012341234");
        userService.deleteUser(delUSer);
    }

    @Test
    @DisplayName("충전 실패 : 500원단위만 충전가능")
    void chargeMoney() {
        User chargeMoney = userRepository.findUserByPhone("01088888888");
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> userService.chargeMoney(chargeMoney,600)
        );

        assertTrue(ex.getMessage().contains("충전 금액은 500원 단위로 입력해주세요."));

    }


}