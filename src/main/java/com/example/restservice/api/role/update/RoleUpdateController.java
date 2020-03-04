package com.example.restservice.api.role.update;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleUpdateController {

    @Autowired
    private RoleUpdateService roleRepository;

    @PutMapping("/{id}")
    @ApiOperation(value = "Atualiza o cargo especificado")
    public RoleUpdateResponse updateRoleById(@PathVariable long id, @RequestBody RoleUpdateRequest role){
        return roleRepository.updateRole(id, role);
    }

}
