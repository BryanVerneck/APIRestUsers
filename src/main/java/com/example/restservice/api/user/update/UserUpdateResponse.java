package com.example.restservice.api.user.update;

import com.example.restservice.domain.user.User;
import lombok.Data;

@Data
public class UserUpdateResponse{

    private long id;
    private String email;
    private String userName;

    public UserUpdateResponse(User user){
        id = user.getId();
        email = user.getEmail();
        userName = user.getUserName();
    }

}
