package com.example.restservice.api.user.create;

import com.example.restservice.domain.user.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserCreateResponse {

    @ApiModelProperty(example = "1")
    private long id;

    @ApiModelProperty(example = "Test")
    private String userName;

    public UserCreateResponse(User user) {
        id = user.getId();
        userName = user.getUserName();
    }

}
