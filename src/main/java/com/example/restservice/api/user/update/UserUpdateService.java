package com.example.restservice.api.user.update;

import com.example.restservice.domain.user.User;
import com.example.restservice.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserUpdateService {

    @Autowired
    UserRepository userRepository;

    public UserUpdateResponse updateUser(long id, UserUpdateRequest user){
        User updatedUser = userRepository.findById(id).get();
        updatedUser.setEmail(user.getEmail());
        updatedUser.setUserName(user.getUserName());
        return new UserUpdateResponse(userRepository.save(updatedUser));
    }

}
