package com.example.restservice.appTest;

import com.example.restservice.user.domain.user.UserRepository;
import org.junit.runner.RunWith;
import org.mockito.Mock;
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
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserEndPointTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private UserRepository userRepository;

    @Autowired
    private MockMvc mockMvc;

    @TestConfiguration
    static class config{
        @Bean
        public RestTemplateBuilder restTemplateBuilder(){
            return new RestTemplateBuilder().basicAuthentication("user", "1234");
        }
    }

    public void listUsersWhenNameAndPasswordAreIncorrectShouldReturnStatusCode401(){
        restTemplate = restTemplate.withBasicAuth("0", "0");

    }

}
