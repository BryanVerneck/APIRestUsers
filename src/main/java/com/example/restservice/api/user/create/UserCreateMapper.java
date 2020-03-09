package com.example.restservice.api.user.create;

import com.example.restservice.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserCreateMapper {

    @Autowired
    private UserCreateRequest user;

    public User transformaParaObjeto(){
        return new User(null, user.getUserName(), user.getFirstName(), user.getLastName(), user.getBirthDate(), user.getEmail(), null);
    }

}
