package com.example.restservice.api.user.integrationTests.detail;

import com.example.restservice.domain.user.User;
import com.example.restservice.domain.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

public class UserDetailIntegrationTest {

    private User user, user1;

    @Mock
    UserRepository userRepository;

    @LocalServerPort
    private int port;

    HttpHeaders headers = new HttpHeaders();

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void init(){
        user = new User(10L,"teste", "teste", "teste", null, "teste@gmail.com", null);
        userRepository.save(user);
        System.out.println("Teste finalizado.");
    }

   @Test
   public void getUserAndReturnStatusCode200(){
       Mockito.when(userRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(user));
       ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/users/{id}", String.class, user.getId());
       Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
   }

}
