package com.example.restservice.api.user.create;

import com.example.restservice.domain.user.User;
import lombok.Data;

@Data
public class UserCreateResponse {

    private long id;
    private String userName;

    public UserCreateResponse(User user) {
        id = user.getId();
        userName = user.getUserName();
    }

}
