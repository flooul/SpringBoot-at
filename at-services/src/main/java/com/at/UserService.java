package com.at;

import com.at.pojo.UserEntity;

import java.util.List;

public interface UserService {
    public List<UserEntity> list();
    public UserEntity save(UserEntity userEntity);

}
