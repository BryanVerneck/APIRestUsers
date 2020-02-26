package com.example.restservice.user.api.list;

import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserListService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

}
