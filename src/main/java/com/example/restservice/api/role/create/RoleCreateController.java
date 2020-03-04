package com.example.restservice.api.role.create;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/roles")
public class RoleCreateController {

    @Autowired
    private RoleCreateService roleService;

    @PostMapping
    @ApiOperation(value = "Adiciona um cargo")
    @ResponseStatus(HttpStatus.OK)
    public RoleCreateResponse saveRole(@Valid @RequestBody RoleCreateRequest role){
        return roleService.create(role.transformaParaObjeto());
    }

}
