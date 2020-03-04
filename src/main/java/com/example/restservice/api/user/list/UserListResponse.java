package com.example.restservice.api.user.list;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class UserListResponse {

    private long id;
    private String firstName;
    private String LastName;
    private String email;
    private String userName;
    private LocalDate birthDate;

}
