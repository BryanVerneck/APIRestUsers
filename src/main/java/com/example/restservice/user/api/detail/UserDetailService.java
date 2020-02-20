package com.example.restservice.user.api.detail;

import com.example.restservice.user.common.exception.ObjectNotFoundException;
import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDetailService {

    @Autowired
    private UserRepository userRepository;

    public User findById(long id){
        User user = userRepository.findById(id);
        if(user == null){
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }

}
