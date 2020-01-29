package com.example.restservice.User.Create;

import com.example.restservice.User.Entity.User;
import com.example.restservice.User.Repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class CreateController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    @ApiOperation(value = "Adiciona um usuário")
    @ResponseStatus(HttpStatus.OK)
    public User SaveUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
