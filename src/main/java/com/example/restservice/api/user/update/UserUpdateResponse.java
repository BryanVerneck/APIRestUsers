package com.example.restservice.api.user.update;

import com.example.restservice.domain.user.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserUpdateResponse{

    @ApiModelProperty(example = "1")
    private long id;

    @ApiModelProperty(example = "Test@gmail.com")
    private String email;

    @ApiModelProperty(example = "Test")
    private String userName;

    public UserUpdateResponse(User user){
        id = user.getId();
        email = user.getEmail();
        userName = user.getUserName();
    }

}
