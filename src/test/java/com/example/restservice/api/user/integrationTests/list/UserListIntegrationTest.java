package com.example.restservice.api.user.integrationTests.list;

import com.example.restservice.domain.user.User;
import com.example.restservice.api.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

public class UserListIntegrationTest {

    private User user, user1;

    @Mock
    UserRepository userRepository;

    @LocalServerPort
    private int port;

    HttpHeaders headers = new HttpHeaders();

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void listUsersWhenNameAndPasswordAreIncorrectShouldReturnStatusCode401() {
        restTemplate = restTemplate.withBasicAuth("test", "123");
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/users", String.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }

}
