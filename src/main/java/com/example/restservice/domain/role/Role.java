package com.example.restservice.domain.role;

import com.example.restservice.domain.privilege.Privilege;
import com.example.restservice.domain.user.User;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    public Role(String name) {
        this.name = name;
    }
}
