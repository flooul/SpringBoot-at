package com.at.impl;

import com.at.UserService;
import com.at.pojo.UserEntity;
import com.at.respository.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserJPA userJPA;

    public UserEntity save(UserEntity userEntity) {

        return userJPA.save(userEntity);
    }

    public List<UserEntity> deleteById(Long id) {
        userJPA.deleteById(id);
        return userJPA.findAll();
    }

    public List<UserEntity> list() {

        return userJPA.findAll();
    }

}
