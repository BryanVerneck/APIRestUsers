package com.example.restservice.appTest;

import com.example.restservice.user.domain.user.UserRepository;
<<<<<<< HEAD
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
=======
import org.junit.runner.RunWith;
import org.mockito.Mock;
>>>>>>> 2c57912820d7d15602ffd21637babefe535caebe
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
<<<<<<< HEAD
=======
import org.springframework.web.client.RestTemplate;
>>>>>>> 2c57912820d7d15602ffd21637babefe535caebe

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserEndPointTest {
<<<<<<< HEAD

    @Autowired
    private TestRestTemplate restTemplate;
    @MockBean
    private UserRepository userRepository;
=======
    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private UserRepository userRepository;

>>>>>>> 2c57912820d7d15602ffd21637babefe535caebe
    @Autowired
    private MockMvc mockMvc;

    @TestConfiguration
    static class config{
        @Bean
        public RestTemplateBuilder restTemplateBuilder(){
            return new RestTemplateBuilder().basicAuthentication("user", "1234");
        }
    }

<<<<<<< HEAD
    @Test
    public void listUsersWhenNameAndPasswordAreIncorrectShouldReturnStatusCode401(){
        restTemplate = restTemplate.withBasicAuth("1", "1");
        ResponseEntity<String> response = restTemplate.getForEntity("/users/", String.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(401);
=======
    public void listUsersWhenNameAndPasswordAreIncorrectShouldReturnStatusCode401(){
        restTemplate = restTemplate.withBasicAuth("0", "0");

>>>>>>> 2c57912820d7d15602ffd21637babefe535caebe
    }

}
