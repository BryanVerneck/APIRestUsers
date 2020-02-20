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

    public UsersDto() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }






}
