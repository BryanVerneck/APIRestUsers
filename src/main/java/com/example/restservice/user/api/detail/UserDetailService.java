package com.example.restservice.user.api.detail;

import com.example.restservice.user.common.exception.ObjectNotFoundException;
import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService {

    @Autowired
    private UserRepository userRepository;

    public User findUserById(long id){
        User user = userRepository.findById(id);
        if(user == null){
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }

}
