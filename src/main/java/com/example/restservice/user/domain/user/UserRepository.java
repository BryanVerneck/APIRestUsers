package com.example.restservice.user.domain.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

    User findById(long id);

}

