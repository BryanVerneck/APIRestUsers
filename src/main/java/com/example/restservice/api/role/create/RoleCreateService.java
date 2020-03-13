package com.example.restservice.api.role.create;

import com.example.restservice.domain.role.Role;
import com.example.restservice.domain.role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleCreateService {

    @Autowired
    private RoleRepository repository;

    @Autowired
    private RoleCreateMapper mapper;

    public RoleCreateResponse create(RoleCreateRequest request){
        Role role = mapper.fromRequestToRole(request);
        return new RoleCreateResponse(repository.save(role));
    }

}
