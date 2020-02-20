package com.example.restservice.user.api.detail;

import com.example.restservice.user.api.common.UsersDto;
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
public class UserDetailController {

    @Autowired
    private UserRepository service;

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna o usuário especificado")
    public ResponseEntity<UsersDto> findUserById(@PathVariable(value = "id") long id){
        User user = service.findById(id);
        return ResponseEntity.ok().body(new UsersDto(user));
    }

}
