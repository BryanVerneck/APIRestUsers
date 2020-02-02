package com.example.restservice.user.api.update;

import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class UserUpdateController {

    @Autowired
    private UserRepository userRepository;

    @PutMapping
    @ApiOperation(value = "Atualiza os dados de um usuário")
    public User UpdateUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Atualiza o email do usuário")
    public ResponseEntity<User> updateUserEmail(@PathVariable(value = "id") Long id, @RequestBody User user) throws Exception{
        User userData = userRepository.findById(id)
                .orElseThrow(() -> new Exception("Employee not found for this id :: " + id));
        userData.setEmail(user.getEmail());
        final User updatedUser = userRepository.save(userData);
        return ResponseEntity.ok(updatedUser);
    }

}