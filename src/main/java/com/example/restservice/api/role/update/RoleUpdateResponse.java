package com.example.restservice.api.role.update;

import com.example.restservice.domain.role.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RoleUpdateResponse {

    @ApiModelProperty(example = "1")
    private long id;

    @ApiModelProperty(example = "Test")
    private String name;

    public RoleUpdateResponse(Role role){
        id = role.getId();
        name = role.getName();
    }

}
