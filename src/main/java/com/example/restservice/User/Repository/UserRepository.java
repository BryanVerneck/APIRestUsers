package com.example.restservice.User.Repository;

import com.example.restservice.User.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

}
