package com.example.restservice.api.role.create;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoleCreateRequest {

    @ApiModelProperty(example = "ADMIN")
    private String name;

}
