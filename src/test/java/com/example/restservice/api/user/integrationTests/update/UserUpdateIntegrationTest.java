package com.example.restservice.api.user.integrationTests.update;

import com.example.restservice.domain.user.User;
import com.example.restservice.api.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import static org.springframework.http.HttpMethod.PUT;

public class UserUpdateIntegrationTest {

    private User user, user1;

    @Mock
    UserRepository userRepository;

    @LocalServerPort
    private int port;

    HttpHeaders headers = new HttpHeaders();

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @Ignore
    public void updateUserAndReturnStatusCode200(){
        Mockito.when(userRepository.save(user)).thenReturn(user);
        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/users/{id}", PUT, null, String.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }
}
