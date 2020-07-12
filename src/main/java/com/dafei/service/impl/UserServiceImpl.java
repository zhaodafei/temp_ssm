package com.dafei.service.impl;

import com.dafei.dao.UserDao;
import com.dafei.model.User;
import com.dafei.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
        // return userDao.selectUserFoo(userId);
    }

    @Override
    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public void save(User user) {
         userDao.save(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public boolean delete(int id) {
        return userDao.delete(id);
    }

}
