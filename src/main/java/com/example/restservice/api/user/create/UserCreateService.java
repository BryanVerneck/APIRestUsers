package com.example.restservice.api.user.create;

import com.example.restservice.domain.role.Role;
import com.example.restservice.domain.role.RoleRepository;
import com.example.restservice.domain.user.User;
import com.example.restservice.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserCreateService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserCreateMapper mapper;

    public UserCreateResponse create(Long roleId, UserCreateRequest request) {
        Optional<Role> role = roleRepository.findById(roleId);
        User user = mapper.fromRequestTouser(request);
        user.setRole(role.get());
        return new UserCreateResponse(userRepository.save(user));
    }

}
