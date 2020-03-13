package com.example.restservice.api.user.unitTests.create;

import com.example.restservice.api.user.create.UserCreateController;
import com.example.restservice.api.user.create.UserCreateRequest;
import com.example.restservice.api.user.create.UserCreateResponse;
import com.example.restservice.api.user.create.UserCreateService;
import com.example.restservice.domain.role.Role;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class UserCreateControllerTest {

    @Test
    public void create_validUser_with_success() throws Exception{
        new TestSpec()
                .given_ValidUser()
                .when_userCreated_returnResponse()
                .when_service_CreateUser()
                .then_assert_isNotNull();
    }
    
    @Test
    public void createInvalidUser_and_return_null() throws Exception{
        new TestSpec()
                .given_invalidUser()
                .when_userCreated_returnResponse()
                .when_service_CreateUser()
                .then_assert_isNull();
    }

    static class TestSpec{

        @InjectMocks
        UserCreateController userCreateController;

        @Mock
        UserCreateService userCreateService;

        UserCreateRequest user;

        UserCreateResponse userCreateResponse;

        Role role;

        public TestSpec(){
            MockitoAnnotations.initMocks(this);
        }

        public TestSpec given_ValidUser(){
            user = new UserCreateRequest("test","test","test", LocalDate.now(),"test@gmail.com");
            role = new Role(1L, "ADMIN");
            return this;
        }

        public TestSpec when_service_CreateUser(){
            userCreateResponse = userCreateController.createUser(role.getId(), user);
            return this;
        }

        public TestSpec when_userCreated_returnResponse(){
            userCreateResponse = new UserCreateResponse();
            when(userCreateService.create(any(), any(UserCreateRequest.class))).thenReturn(userCreateResponse);
            return this;
        }

        public TestSpec then_assert_isNotNull(){
            assertThat(userCreateResponse)
                    .isNotNull();
            return this;
        }

        public TestSpec given_invalidUser() {
            user = new UserCreateRequest(null, null,null, null,null);
            role = new Role(1L, "ADMIN");
            return this;
        }

        public TestSpec then_assert_isNull(){
            assertThat(userCreateResponse.getUserName()).isNull();
            return this;
        }

    }


}
