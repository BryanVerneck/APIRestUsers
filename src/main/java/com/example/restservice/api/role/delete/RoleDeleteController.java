package com.example.restservice.api.role.delete;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleDeleteController {

    @Autowired
    private RoleDeleteService roleDeleteService;

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deleta um usuário")
    public void deleteRole(@PathVariable long id){
        roleDeleteService.delete(id);
    }

}
