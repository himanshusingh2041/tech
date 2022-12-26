package com.tech.dao.impl;

import com.tech.dao.UserDao;
import com.tech.entity.UserEntity;
import com.tech.model.UserDetail;
import org.springframework.stereotype.Service;

@Service
public class UserDaoEntity implements UserDao {

    @Override
    public UserEntity createUser(UserDetail userDetail) {
        return null;
    }
}
