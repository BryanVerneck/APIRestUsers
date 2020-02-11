package com.example.restservice.user.api.common;

import com.example.restservice.user.api.role.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UsersDto {

    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String userName;
    private LocalDate birthDate;
    private Role roles;

}
