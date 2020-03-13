package com.example.restservice.api.user.create;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest{

    @ApiModelProperty(example = "Test")
    @NotNull
    private String userName;

    @NotNull
    @ApiModelProperty(example = "Test")
    private String firstName;

    @NotNull
    @ApiModelProperty(example = "Test")
    private String lastName;

    @ApiModelProperty(example = "2020-01-01")
    private LocalDate birthDate;

    @NotNull
    @ApiModelProperty(example = "Test@gmail.com")
    private String email;

}
