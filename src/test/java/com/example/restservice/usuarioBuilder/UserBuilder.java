package com.example.restservice.usuarioBuilder;

import com.example.restservice.domain.user.User;

public class UserBuilder {

    private User user;

    private UserBuilder(){}

    public static UserBuilder generateUser(){
        UserBuilder builder = new UserBuilder();
        builder.user = new User(1L,"test01","test01","test01", null, "test01@gmail.com");
        return builder;
    }

    public User actual(){
        return user;
    }

}
