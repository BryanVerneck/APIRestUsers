package com.example.restservice.user.api.create;

import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class UserCreateController{

    @Autowired
    private UserCreateService userService;

    @PostMapping
    @ApiOperation(value = "Adiciona um usuário")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user) throws Exception{ //UserCreateRequest
       user = userService.create(user);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(path).body(user);
    }

}
