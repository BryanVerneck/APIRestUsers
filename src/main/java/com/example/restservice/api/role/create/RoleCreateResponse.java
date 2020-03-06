package com.example.restservice.api.role.create;

import com.example.restservice.domain.role.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RoleCreateResponse {

    @ApiModelProperty(example = "1")
    private long id;

    @ApiModelProperty(example = "ADMIN")
    private String name;

    public RoleCreateResponse(Role role) {
        id = role.getId();
        name = role.getName();
    }

}
