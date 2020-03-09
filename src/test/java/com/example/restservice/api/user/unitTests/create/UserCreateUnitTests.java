package com.example.restservice.api.user.unitTests.create;

import com.example.restservice.domain.user.User;
import com.example.restservice.domain.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jws.soap.SOAPBinding;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserCreateUnitTests {

    @Mock
    UserRepository userRepository;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void teste(){
        User user = mock(User.class);
        userRepository.save(user);
        when(user.getEmail()).thenReturn("test");
        assertThat(user.getId()).isNotNull();
        assertThat(user.getEmail()).isEqualTo("test");
    }

}
