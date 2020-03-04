package com.example.restservice.api.role.list;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleListController {

    @Autowired
    RoleListService roleListService;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de cargos")
    public List<RoleListResponse> listRoles(){
        return roleListService.list();
    }

}
