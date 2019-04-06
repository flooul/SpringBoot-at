package com.at;

import com.at.pojo.UserEntity;

import java.util.List;

public interface UserService {
    public List<UserEntity> list() throws  Exception;
    public UserEntity save(UserEntity userEntity) throws  Exception;
    public List<UserEntity> deleteById(Long id) throws  Exception;

}
