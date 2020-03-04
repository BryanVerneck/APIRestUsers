package com.example.restservice.api.role.create;

import com.example.restservice.domain.role.Role;
import lombok.Data;

@Data
public class RoleCreateResponse {

    private long id;
    private String userName;

    public RoleCreateResponse(Role role) {
        id = role.getId();
        userName = role.getName();
    }

}
