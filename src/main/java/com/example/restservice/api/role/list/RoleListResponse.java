package com.example.restservice.api.role.list;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoleListResponse {

    @ApiModelProperty(example = "1")
    private long id;

    @ApiModelProperty(example = "Test")
    private String name;

}
