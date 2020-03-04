package com.example.restservice.api.role.update;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RoleUpdateRequest {

    @NotNull
    @ApiModelProperty(example = "updated")
    private String name;

}
