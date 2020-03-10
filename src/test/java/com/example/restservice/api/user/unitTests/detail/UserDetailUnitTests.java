package com.example.restservice.api.user.unitTests.detail;

import com.example.restservice.domain.user.User;
import com.example.restservice.domain.user.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
@DataJpaTest
public class UserDetailUnitTests {

    @Mock
    UserRepository userRepository;

    @Test
    public void DetailShouldReturnUser(){
        User user = mock(User.class);
        userRepository.save(user);
        assertThat(userRepository.findById(user.getId())).isNotNull();
    }

}
