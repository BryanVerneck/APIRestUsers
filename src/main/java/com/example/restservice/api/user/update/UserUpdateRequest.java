package com.example.restservice.api.user.update;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserUpdateRequest{

    @NotNull
    @ApiModelProperty(example = "updated")
    private String email;

    @NotNull
    @ApiModelProperty(example = "updated")
    private String userName;

}
