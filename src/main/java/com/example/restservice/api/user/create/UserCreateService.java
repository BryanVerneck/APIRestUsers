package com.example.restservice.api.user.create;

import com.example.restservice.domain.user.User;
import com.example.restservice.api.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCreateService {

    @Autowired
    private UserRepository userRepository;

    public UserCreateResponse create(User request) {
        return new UserCreateResponse(userRepository.save(request));
    }

}
