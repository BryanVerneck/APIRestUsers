package com.example.restservice.user.api.common;

import com.example.restservice.user.api.role.Role;
import com.example.restservice.user.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class UsersDto {

    private long id;
    private String email;
    private String firstName;
    private String lastName;
    private String userName;
    private LocalDate birthDate;

    public UsersDto(User obj) {
        this.id = obj.getId();
        this.email = obj.getEmail();
        this.firstName = obj.getFirstName();
        this.lastName = obj.getLastName();
        this.userName = obj.getUserName();
        this.birthDate = obj.getBirthDate();
    }

}
