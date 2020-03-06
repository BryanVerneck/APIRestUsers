package com.example.restservice.api.role.list;

import com.example.restservice.domain.role.Role;
import com.example.restservice.domain.role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoleListService {

    @Autowired
    RoleRepository roleRepository;

    public List<RoleListResponse> list(){
        List<RoleListResponse> listRoles = new ArrayList<>();
        List<Role> roles = roleRepository.findAll();
        for(Role u : roles){
            listRoles.add(new RoleListResponse(u.getId(), u.getName()));
        }
        return listRoles;
    }

}
