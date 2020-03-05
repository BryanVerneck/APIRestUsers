package com.example.restservice.domain.privilege;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public Privilege(String name) {
        this.name = name;
    }
}

