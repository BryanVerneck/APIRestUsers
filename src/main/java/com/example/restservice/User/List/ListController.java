package com.example.restservice.User.List;

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
public class ListController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de usuários")
    public List<User> listUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna o usuário especificado")
    public User ListUserById(@PathVariable(value = "id") long id){
        return userRepository.findById(id);
    }

}
