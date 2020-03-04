package com.example.restservice.api.user.detail;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class UserDetailController {

    @Autowired
    private UserDetailService service;

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna o usuário especificado")
    public UserDetailResponse findUserById(@PathVariable Long id){
        return service.findUser(id);
    }

}
