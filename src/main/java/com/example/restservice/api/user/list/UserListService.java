package com.example.restservice.api.user.list;

import com.example.restservice.domain.user.User;
import com.example.restservice.api.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserListService {

    @Autowired
    private UserRepository repository;

    public List<UserListResponse> getUsersList(){
        List<UserListResponse> listUsers = new ArrayList<>();
        List<User> users = repository.findAll();
        for(User u : users){
            listUsers.add(new UserListResponse(u.getId(), u.getFirstName(), u.getLastName(), u.getEmail(), u.getUserName(), u.getBirthDate(), u.getRole()));
        }
        return listUsers;
    }

}
