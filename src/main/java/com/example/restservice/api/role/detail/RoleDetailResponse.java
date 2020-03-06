package com.example.restservice.api.role.detail;

import com.example.restservice.domain.role.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RoleDetailResponse {

    @ApiModelProperty(example = "1")
    private long id;

    @ApiModelProperty(example = "Test")
    private String name;

    public RoleDetailResponse(Role role) {
        id = role.getId();
        name = role.getName();
    }

}
