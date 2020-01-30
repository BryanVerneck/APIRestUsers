package com.example.restservice.user.api.list;

import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
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
