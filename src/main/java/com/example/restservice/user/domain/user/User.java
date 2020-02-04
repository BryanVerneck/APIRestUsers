package com.example.restservice.user.domain.user;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name="TB_USER")
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

    @Getter
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;

    @Getter @Setter
    private String userName;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private LocalDate birthDate;

    @Getter @Setter
    private String email;

}
