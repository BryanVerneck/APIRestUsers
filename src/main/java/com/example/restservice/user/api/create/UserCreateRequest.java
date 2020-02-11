package com.example.restservice.user.api.create;

import com.example.restservice.user.api.common.UsersDto;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class UserCreateRequest extends UsersDto {

    @NotNull
    private String userName;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;

}
