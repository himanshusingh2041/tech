package com.tech.service.impl;

import com.tech.dao.UserDao;
import com.tech.model.UserDetail;
import com.tech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public Boolean createUser(UserDetail userDetail) {
        return null;
    }
}
