package com.example.restservice.user.api.create;

import com.example.restservice.logger.LoggingController;
import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @Autowired
    private UserCreateService userService;

    @PostMapping
    @ApiOperation(value = "Adiciona um usuário")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user) throws Exception{ //UserCreateRequest
        try {
            user = userService.create(user);
            URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
            logger.info("User added with success");
            return ResponseEntity.created(path).body(user);
        }catch (Exception e){
            logger.error("ERROR :: invalid user");
        }
        return null;
    }

}
