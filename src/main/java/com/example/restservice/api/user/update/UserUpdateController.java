package com.example.restservice.api.user.update;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class UserUpdateController {

    @Autowired
    private UserUpdateService userRepository;

    @PutMapping("/{id}")
    @ApiOperation(value = "Atualiza o usuário especificado")
    public UserUpdateResponse updateUserById(@PathVariable long id, @RequestBody UserUpdateRequest user){
        return userRepository.updateUser(id, user);
    }

}
