package com.example.restservice.api.user.list;

import com.example.restservice.domain.role.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class UserListResponse {

    @ApiModelProperty(example = "1")
    private long id;

    @ApiModelProperty(example = "Test")
    private String firstName;

    @ApiModelProperty(example = "Test")
    private String LastName;

    @ApiModelProperty(example = "Test@gmail.com")
    private String email;

    @ApiModelProperty(example = "Test")
    private String userName;

    @ApiModelProperty(example = "2020-01-01")
    private LocalDate birthDate;

    @ApiModelProperty(example = "1, ADMIN")
    private Role role;

}
