package com.example.restservice.api.user.delete;

import com.example.restservice.api.user.UserRepository;
import com.example.restservice.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDeleteService {

    @Autowired
    private UserRepository userRepository;

    private User user;

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
