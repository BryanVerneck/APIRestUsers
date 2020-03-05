package com.example.restservice.api.user.integrationTests.delete;

import com.example.restservice.RestServiceApplication;
import com.example.restservice.domain.user.User;
import com.example.restservice.api.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.http.HttpMethod.DELETE;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserDeleteIntegrationTest {

    private User user;

    @Mock
    UserRepository userRepository;

    @LocalServerPort
    private int port;

    HttpHeaders headers = new HttpHeaders();

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void init(){
        user = new User(1L,"teste", "teste", "teste", null, "teste@gmail.com", null);
        System.out.println("Teste finalizado.");
    }

    @Test
    public void deleteUserAndReturnStatusCode200(){
        Mockito.doNothing().when(userRepository).delete(user);
        ResponseEntity<String> exchange = restTemplate.exchange("http://localhost:8080/users/{id}", DELETE, null, String.class, 1);
        Assertions.assertThat(exchange.getStatusCodeValue()).isEqualTo(200);
    }
}
