package com.example.restservice.user.api.list;

import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class UserListController {

    @Autowired
    private UserRepository service;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de usuários")
    public ResponseEntity<List<User>> listUsers(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
