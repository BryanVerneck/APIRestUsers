package com.example.restservice.Resourses;

import com.example.restservice.Models.User;
import com.example.restservice.Repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class UserController {

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

    @PostMapping
    @ApiOperation(value = "Adiciona um usuário")
    public User SaveUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping
    @ApiOperation(value = "Atualiza os dados de um usuário")
    public User UpdateUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @DeleteMapping
    @ApiOperation(value = "Deleta um usuário")
    public void deleteUser(@RequestBody User user){
        userRepository.delete(user);
    }

}
