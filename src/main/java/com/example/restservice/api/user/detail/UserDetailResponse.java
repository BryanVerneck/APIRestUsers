package com.example.restservice.api.user.detail;

import com.example.restservice.domain.user.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserDetailResponse{

    @ApiModelProperty(example = "1")
    private long id;

    @ApiModelProperty(example = "Test")
    private String name;

    @ApiModelProperty(example = "Test@gmail.com")
    private String email;

    public UserDetailResponse(User user) {
        id = user.getId();
        name = user.getFirstName();
        email = user.getEmail();
    }


}
