package com.example.restservice.api.role.update;

import com.example.restservice.domain.role.Role;
import lombok.Data;

@Data
public class RoleUpdateResponse {
    private long id;
    private String name;

    public RoleUpdateResponse(Role role){
        id = role.getId();
        name = role.getName();
    }
}
