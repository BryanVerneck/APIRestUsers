//package com.example.restservice.api.user.unitTests.create;
//
//package api.users.user.create;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//class UserCreateControllerTest {
//
//    @Test
//    public void createUser_Success() {
//        new TestSpec()
//                .given_validRequest()
//                .when_service_createUser_then_returnValidResponse()
//                .when_createUser()
//                .then_success();
//    }
//
//    @Test
//    public void createUser_withoutEmail_Fail() {
//        new TestSpec()
//                .given_invalidRequest()
//                .when_service_createUser_then_returnValidResponse()
//                .when_createUser()
//                .then_fail();
//    }
//
//    class TestSpec {
//
//        @Mock
//        UserCreateService userCreateService;
//
//        @InjectMocks
//        UserCreateController userCreateController;
//
//        UserCreateRequest request;
//
//        UserCreateResponse response;
//
//        public TestSpec() {
//            MockitoAnnotations.initMocks(this);
//        }
//
//        public TestSpec given_validRequest() {
//            request = new UserCreateRequest();
//            request.setEmail("marta@gmail.com");
//            request.setFirstName("Marta");
//            request.setLastName("Santos");
//            request.setBirthDate("1990-05-05");
//            return this;
//        }
//
//
//        public TestSpec given_invalidRequest() {
//            request = new UserCreateRequest();
//            request.setEmail(null);
//            request.setFirstName("Marta");
//            request.setLastName("Santos");
//            request.setBirthDate("1990-05-05");
//            return this;
//        }
//
//        public TestSpec when_service_createUser_then_returnValidResponse() {
//            response = new UserCreateResponse();
//            when(userCreateService.createUser(any(UserCreateRequest.class))).thenReturn(response);
//            return this;
//        }
//
//        public TestSpec when_createUser() {
//            response = userCreateController.userCreate(request);
//            return this;
//        }
//
//        public TestSpec then_success() {
//            assertThat(response).isNotNull();
//            return this;
//        }
//
//        public TestSpec then_fail() {
//            assertThat(response.getId()).isNull();
//            return this;
//        }
//    }
//}
