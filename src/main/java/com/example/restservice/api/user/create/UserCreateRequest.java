package com.example.restservice.api.user.create;

import com.example.restservice.domain.user.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
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

    public User transformaParaObjeto(){
        return new User(null, userName, firstName, lastName, birthDate, email, null);
    }

}
