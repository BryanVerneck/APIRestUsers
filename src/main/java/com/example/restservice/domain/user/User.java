package com.example.restservice.domain.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 10, min = 2)
    private String userName;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private LocalDate birthDate;

    @NotNull
    private String email;

    public User(long id){
        this.id = id;
    }
}