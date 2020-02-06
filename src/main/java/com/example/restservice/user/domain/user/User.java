package com.example.restservice.user.domain.user;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name="TB_USER")
@Setter
@Getter
public class User implements Serializable {

    public User() {
    }

    public User(String userName, String firstName, String lastName, LocalDate birthDate, String email) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
    }

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userName;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String email;

}
