package com.example.restservice.User.Update;


import com.example.restservice.User.Entity.User;
import com.example.restservice.User.Repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class UpdateController {

    @Autowired
    private UserRepository userRepository;

    @PutMapping
    @ApiOperation(value = "Atualiza os dados de um usuário")
    public User UpdateUser(@RequestBody User user){
        return userRepository.save(user);
    }

}