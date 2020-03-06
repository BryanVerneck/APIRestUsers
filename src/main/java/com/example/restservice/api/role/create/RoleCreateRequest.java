package com.example.restservice.api.role.create;

import com.example.restservice.domain.role.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RoleCreateRequest {

    @ApiModelProperty(example = "ADMIN")
    private String name;

    public Role transformaParaObjeto(){
        return new Role(null, name);
    }

}
