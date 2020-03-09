package com.example.restservice.api.user.detail;

import com.example.restservice.common.exception.ApiRequestException;
import com.example.restservice.domain.user.UserRepository;
import com.example.restservice.common.exception.ObjectNotFoundException;
import com.example.restservice.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService {

    @Autowired
    private UserRepository userRepository;

    public UserDetailResponse findUser(Long id){
        User user = userRepository.findById(id).get();
        if(user.getId() == null){
            throw new ApiRequestException("User not found for ID: " + id);
        }
        return new UserDetailResponse(user);
    }

}
