package com.example.restservice.api.role.delete;

import com.example.restservice.api.role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleDeleteService {

    @Autowired
    private RoleRepository roleRepository;

    public void delete(Long id) {
        roleRepository.deleteById(id);
    }
}
