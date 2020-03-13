package com.example.restservice.api.user.unitTests.create;

import com.example.restservice.api.user.create.UserCreateMapper;
import com.example.restservice.api.user.create.UserCreateService;
import com.example.restservice.domain.role.RoleRepository;
import com.example.restservice.domain.user.UserRepository;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class UserCreateServiceTest {

    class TestSpec{

        @InjectMocks
        UserCreateService userCreateService;

        @Mock
        UserRepository repository;

        @Mock
        UserCreateMapper mapper;

        @Mock
        RoleRepository roleRepository;


    }
}
