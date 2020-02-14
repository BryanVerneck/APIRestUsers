package com.example.restservice.user.api.create;

import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCreateService {

    @Autowired
    private UserRepository userRepository;

    public User create(User request) {
        return userRepository.save(request);
    }

}
