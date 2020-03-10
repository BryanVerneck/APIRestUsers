package com.example.restservice.api.user.unitTests.delete;

import com.example.restservice.domain.user.User;
import com.example.restservice.domain.user.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserDeleteUnitTests {

    @Mock
    UserRepository userRepository;

    @Test
    public void DeleteShouldRemoveData(){
        User user = mock(User.class);
        userRepository.save(user);
        userRepository.delete(user);
        assertThat(userRepository.findById(user.getId())).isEmpty();
    }

}
