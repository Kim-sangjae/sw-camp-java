package com.sangjae.rdpoject.repository.storage;

import com.sangjae.rdpoject.domain.User;

import java.util.List;

public interface UserStorage {
    void saveUsers(List<User> users);
    List<User> loadUsers();
}
