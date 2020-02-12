package com.example.restservice.user.api.common;

import com.example.restservice.user.domain.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsersMapper{
    UsersMapper INSTANCE = Mappers.getMapper( UsersMapper.class );

    UsersDto userToUserDto(User user);
    User toUsers(UsersDto user);
}
