package com.example.restservice.api.user.create;

import com.example.restservice.domain.user.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserCreateMapper {

    User fromRequestTouser(UserCreateRequest request);

}
