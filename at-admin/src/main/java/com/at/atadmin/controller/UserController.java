package com.at.atadmin.controller;


import com.at.UserService;
import com.at.pojo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired(required =true)
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserEntity> list(){
        return userService.list();
    }

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public UserEntity save(UserEntity userEntity){
        return userService.save(userEntity);
    }
    /*@RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<UserEntity> delete(Long id){
        userService.deleteById(id);

        return userService.findAll();
    }*/



}
