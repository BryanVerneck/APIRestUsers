package com.example.restservice.api.user.create;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class UserCreateController{

    @Autowired
    private UserCreateService userService;

    @PostMapping
    public UserCreateResponse createUser(@Valid @RequestBody UserCreateRequest user){
        return userService.create(user.transformaParaObjeto());
   }

}
