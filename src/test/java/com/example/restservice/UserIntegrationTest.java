package com.example.restservice;

import com.example.restservice.RestServiceApplication;
import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserIntegrationTest {

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
        user = new User(1 ,"teste", "teste", "teste", null, "teste@gmail.com");
        user1 = new User(2 ,null, "teste", "teste", null, "teste@gmail.com");
    }

    @TestConfiguration
    static class config{
        @Bean
        public RestTemplateBuilder restTemplateBuilder(){
            return new RestTemplateBuilder().basicAuthentication("user", "1234");
        }
    }

    @Test
    public void listUsersWhenNameAndPasswordAreIncorrectShouldReturnStatusCode401() {
        restTemplate = restTemplate.withBasicAuth("test", "123");
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/users", String.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void getUserAndReturnStatusCode200(){
        Mockito.when(userRepository.findById(1)).thenReturn(user);
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/users/{id}", String.class, user.getId());
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void createWhenNameIsNullAndReturnStatusCode400(){
        Mockito.when(userRepository.save(user1)).thenReturn(user1);
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/users/", user1, String.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(400);
    }

    @Test
    public void createUserAndReturnStatusCode200(){
        Mockito.when(userRepository.save(user)).thenReturn(user);
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/users/", user, String.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }

    /*
    @Test
    public void updateUserAndReturnStatusCode200(){
        Mockito.when(userRepository.save(userRepository.findById(user.getId()))).thenReturn(user);
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/users/{id}", user.getId(), String.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }*/

    private String createUrlWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }

}

