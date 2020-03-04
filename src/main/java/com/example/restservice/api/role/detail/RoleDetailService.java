package com.example.restservice.api.role.detail;

import com.example.restservice.api.role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleDetailService {

    @Autowired
    RoleRepository roleRepository;

    public RoleDetailResponse getRole(long id){
        return new RoleDetailResponse(roleRepository.findById(id).get());
    }
}
