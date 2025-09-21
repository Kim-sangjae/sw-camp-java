package com.sangjae.rdpoject.repository;

import com.sangjae.rdpoject.domain.User;
import com.sangjae.rdpoject.repository.storage.UserStorage;

import java.util.List;

public class UserRepository {
    private final UserStorage userStorage;
    private final List<User> userList;


    public UserRepository(UserStorage userStorage) {
        this.userStorage = userStorage;
        this.userList = userStorage.loadUsers();
    }



    public void insertUser(User user){
        userList.add(user);

        userStorage.saveUsers(userList);
    }


    public List<User> selectAllUser(){
        return userList;
    }

    public User selectOneUserId(String userId) {
        return userList.stream()
                .filter(user -> user.getUserId().equals(userId))
                .findFirst().orElse(null);
    }


    public User findUserByPhone(String phone){

        return  userList.stream()
                .filter(user -> user.getPhoneNumber().equals(phone))
                .findFirst().orElse(null);
    }



    // 유저 money 충전
    public void updateUserMoney(User user, int money) {
        for (int i = 0; i < userList.size(); i++) {
            User u = userList.get(i);

            if (u.getUserCode() == user.getUserCode()) {
                u.updateMoney(money);
                userList.set(i, u);
                userStorage.saveUsers(userList);
                break;
            }
        }
    }


    // 유저정보 수정
    public void modifyUser(User newUser) {
        for (int i = 0; i < userList.size(); i++) {

            if (userList.get(i).getUserCode() == newUser.getUserCode()) {
                userList.set(i, newUser);
                userStorage.saveUsers(userList);
                break;
            }
        }
    }


    public void deleteUser(User delUser){
        for (int i = 0; i < userList.size(); i++) {

            if (userList.get(i).getUserCode() == delUser.getUserCode()) {
                userList.remove(i);
                userStorage.saveUsers(userList);
                break;
            }
        }
    }



}//class
