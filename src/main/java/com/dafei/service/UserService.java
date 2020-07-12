package com.dafei.service;

import com.dafei.model.User;

import java.util.List;

public interface UserService {
    User selectUser(long userId);

    List<User> selectAllUser();

    void save(User user);

    int update(User user);

    boolean delete(int id);

}
