package com.tech.dao;

import com.tech.entity.UserEntity;
import com.tech.model.UserDetail;

public interface UserDao {

    public UserEntity createUser(UserDetail userDetail);
}
