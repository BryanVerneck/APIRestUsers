package com.example.restservice.user.api.deleteAll;

import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
public class DeleteAllController {

    @Autowired
    private UserRepository user;

    @DeleteMapping
    public void deleteAll(){
        user.deleteAll();
    }

}
