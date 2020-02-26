package com.example.restservice.user.api.delete;

import com.example.restservice.user.domain.user.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
public class DeleteController {

    @Autowired
    private UserRepository userRepository;

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deleta um usuário")
    public void deleteUser(@PathVariable(value = "id") long id){
        userRepository.deleteById(id);
    }

}
