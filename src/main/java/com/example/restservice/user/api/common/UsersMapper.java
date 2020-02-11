package com.example.restservice.user.api.common;

import com.example.restservice.user.domain.user.User;

public abstract class UsersMapper{

    abstract User toUsers(UsersDto user);
    abstract UsersDto toUsersDto(User user);
}
