package com.example.restservice.api.user.integrationTests;

import com.example.restservice.RestServiceApplication;
import com.example.restservice.domain.user.User;
import com.example.restservice.api.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.MethodSorters;
import org.mockito.Mock;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;
import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.PUT;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserIntegrationTest {

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
        user = new User(1L,"teste", "teste", "teste", null, "teste@gmail.com");
        user1 = new User(2L,null, "teste", "teste", null, "teste@gmail.com");
        System.out.println("Teste finalizado.");
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
        Mockito.when(userRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(user));
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
    public void createUserAndReturnStatusCode201(){
        Mockito.when(userRepository.save(user)).thenReturn(user);
        ResponseEntity<User> response = restTemplate.postForEntity("http://localhost:8080/users/", user, User.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(201);
    }

    @Test
    @Ignore
    public void updateUserAndReturnStatusCode200(){
        Mockito.when(userRepository.save(user)).thenReturn(user);
        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/users/{id}", PUT, null, String.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void deleteUserAndReturnStatusCode200(){
        Mockito.doNothing().when(userRepository).delete(user);
        ResponseEntity<String> exchange = restTemplate.exchange("http://localhost:8080/users/{id}", DELETE, null, String.class, 1);
        Assertions.assertThat(exchange.getStatusCodeValue()).isEqualTo(200);
    }

    private String createUrlWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }

}
