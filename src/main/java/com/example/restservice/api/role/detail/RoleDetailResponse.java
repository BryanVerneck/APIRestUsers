package com.example.restservice.api.role.detail;

import com.example.restservice.domain.role.Role;
import lombok.Data;

@Data
public class RoleDetailResponse {

    private long id;
    private String name;

    public RoleDetailResponse(Role role) {
        id = role.getId();
        name = role.getName();
    }
}
