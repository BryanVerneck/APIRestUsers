package com.example.restservice.user.api.create;

import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class UserCreateController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    @ApiOperation(value = "Adiciona um usuário")
    @ResponseStatus(HttpStatus.OK)
    public User SaveUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
