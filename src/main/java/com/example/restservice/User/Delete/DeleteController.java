package com.example.restservice.User.Delete;

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
public class DeleteController {

    @Autowired
    private UserRepository userRepository;

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deleta um usuário")
    public void deleteUser(@PathVariable(value = "id") long id){
        userRepository.deleteById(id);
    }

}
