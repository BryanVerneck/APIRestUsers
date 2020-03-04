package com.example.restservice.api.role.update;

import com.example.restservice.api.role.RoleRepository;
import com.example.restservice.api.user.update.UserUpdateResponse;
import com.example.restservice.domain.role.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleUpdateService {

    @Autowired
    RoleRepository roleRepository;

    public RoleUpdateResponse updateRole(long id, RoleUpdateRequest role){
        Role updatedRole = roleRepository.findById(id).get();
        updatedRole.setName(role.getName());
        return new RoleUpdateResponse(roleRepository.save(updatedRole));
    }
}
