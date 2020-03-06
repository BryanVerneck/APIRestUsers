package com.example.restservice.domain.user;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

import com.example.restservice.domain.role.Role;
import cucumber.api.java.it.Date;
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
    @Size(max = 10, min = 2)
    private String firstName;

    @NotNull
    @Size(max = 10, min = 2)
    private String lastName;

    private LocalDate birthDate;

    @NotNull
    @Email
    private String email;

    @ManyToOne
    private Role role;

    public User(long id){
        this.id = id;
    }

}
