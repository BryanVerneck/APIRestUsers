package com.example.restservice.api.user.unitTests.update;

import com.example.restservice.domain.user.User;
import com.example.restservice.domain.user.UserRepository;
import cucumber.api.java.cs.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserUpdateUnitTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void updateShouldChangeAndPersistData(){
        User user = new User(1L,"teste", "teste", "teste", null, "teste@gmail.com", null);
        userRepository.save(user);
        user.setUserName("updated");
        user.setFirstName("updated");
        userRepository.save(user);
        user = userRepository.findById(user.getId()).get();
        assertThat(user.getUserName()).isEqualTo("updated");
        assertThat(user.getFirstName()).isEqualTo("updated");
    }

}
