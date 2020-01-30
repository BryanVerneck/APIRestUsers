package com.example.restservice.user.domain.user;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name="TB_USER")
public class User implements Serializable {

    @Getter
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long id;

    @Getter @Setter
    private String userName;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private Date birthDate;

    @Getter @Setter
    private String email;

}
