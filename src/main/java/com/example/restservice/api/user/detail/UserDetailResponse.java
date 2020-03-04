package com.example.restservice.api.user.detail;

import com.example.restservice.domain.user.User;
import lombok.Data;

@Data
public class UserDetailResponse{

    private long id;
    private String name;
    private String email;

    public UserDetailResponse(User user) {
        id = user.getId();
        name = user.getFirstName();
        email = user.getEmail();
    }


}
