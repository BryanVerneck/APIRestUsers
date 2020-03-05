package com.example.restservice.api.user.list;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.security.krb5.internal.AuthorizationDataEntry;

import java.util.List;

@RestController
@RequestMapping("/users")
@Api(value= "API rest users")
@CrossOrigin("*")
public class UserListController {

    @Autowired
    private UserListService service;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de usuários")
    public List<UserListResponse> listUser(){
        return service.getUsersList();
    }

}
