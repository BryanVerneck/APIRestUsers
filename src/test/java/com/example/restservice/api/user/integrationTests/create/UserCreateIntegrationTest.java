package com.example.restservice.api.user.integrationTests.create;

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

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserCreateIntegrationTest {

    private User user, user1;

    private static int cont;

    @Mock
    UserRepository userRepository;

    @LocalServerPort
    private int port;

    HttpHeaders headers = new HttpHeaders();

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void init(){
        System.out.println("Iniciando teste " + cont + "...");
        cont ++;
        user = new User(1L,"teste", "teste", "teste", null, "teste@gmail.com", null);
        user1 = new User(2L,null, "teste", "teste", null, "teste@gmail.com", null);
        System.out.println("Teste finalizado.");
    }

    @Test
    public void createWhenNameIsNullAndReturnStatusCode400(){
        Mockito.when(userRepository.save(user1)).thenReturn(user1);
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/users/", user1, String.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(400);
    }

    @Test
    public void createUserAndReturnStatusCode201(){
        Mockito.when(userRepository.save(user)).thenReturn(user);
        ResponseEntity<User> response = restTemplate.postForEntity("http://localhost:8080/users/", user, User.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(201);
    }
}
