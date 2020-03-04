package com.example.restservice.api.user.delete;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
public class DeleteController {

    @Autowired
    private UserDeleteService userDeleteService;

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deleta um usuário")
    public void deleteUser(@PathVariable(value = "id") Long id){
        userDeleteService.delete(id);
    }

}
