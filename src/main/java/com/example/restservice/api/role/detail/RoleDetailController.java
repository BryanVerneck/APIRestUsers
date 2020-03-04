package com.example.restservice.api.role.detail;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleDetailController {

    @Autowired
    RoleDetailService roleDetailService;

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna o cargo especificado")
    public RoleDetailResponse roleDetailResponse(@PathVariable long id){
        return roleDetailService.getRole(id);
    }

}
