package com.example.restservice.api.user.detail;

import com.example.restservice.api.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService {

    @Autowired
    private UserRepository userRepository;

    public UserDetailResponse findUser(Long id){
        return new UserDetailResponse(userRepository.findById(id).get());
    }

}
