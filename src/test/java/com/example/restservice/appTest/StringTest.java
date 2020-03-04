package com.example.restservice.appTest;

import com.example.restservice.app.StringUtil;
import com.example.restservice.domain.user.User;
import com.example.restservice.api.user.UserRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StringTest {

    @Mock
    private User user;

    @Mock
    private ArrayList<Integer> lista;

    @Autowired
    private UserRepository repository;

    @Mock
    private UserRepository userRepository;

    @org.junit.Test
    public void returnUserCount(){
        when(userRepository.count()).thenReturn((long) 100);
        System.out.println(userRepository.count());
    }

    @org.junit.Test
    public void returnUser(){
        User user1 = mock(User.class);
        when(user1.getUserName()).thenReturn("Pedro");
        System.out.println(user1.getUserName());
    }

    @org.junit.Test
    public void ArraySize100(){
        System.out.println("Tamanho da lista: " + lista.size());
        when(lista.size()).thenReturn(100);
        System.out.println("Tamanho da lista: " + lista.size());
    }

    @Test
    public void testFindAll(){
        //Collection<User> list = repository.findAll();

        //Assert.assertNotNull("failure - expected not null", list);
        //Assert.assertEquals("failure - expected size", 1, list.size());
        //System.out.println(list.size());

    }

    @Test
    public void testFindById(){
        Long id = 1L;

        User user = new User();

        Assert.assertNotNull("failure - expected not null", user);
        Assert.assertEquals(java.util.Optional.of(0), user.getId());

    }

    @Test
    public void testIsEmpty(){
        boolean b;
        b = StringUtil.isEmpty("abc");
        Assert.assertFalse(b);

        b = StringUtil.isEmpty("");
        Assert.assertTrue(b);
    }

    @Test
    public void testReverse(){
        String r = StringUtil.reverse("abcd");
        Assert.assertEquals("dcba", r);

        r = StringUtil.reverse(null);
        Assert.assertNull(r);

    }

    @Before
    public void before(){
        System.out.println("Iniciando teste...");
    }

    @After
    public void after(){
        System.out.println("Teste finalizado.");
    }

}
