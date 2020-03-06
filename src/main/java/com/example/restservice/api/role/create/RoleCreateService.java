package com.example.restservice.api.role.create;

import com.example.restservice.domain.role.Role;
import com.example.restservice.domain.role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleCreateService {

    @Autowired
    private RoleRepository repository;

    public RoleCreateResponse create(RoleCreateRequest request){
        Role role = request.transformaParaObjeto();
        return new RoleCreateResponse(repository.save(role));
    }

}
