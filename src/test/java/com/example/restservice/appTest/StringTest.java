package com.example.restservice.appTest;

import com.example.restservice.app.StringUtil;
import com.example.restservice.user.domain.user.User;
import com.example.restservice.user.domain.user.UserRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

@RunWith(MockitoJUnitRunner.class)
public class StringTest {

    @Mock
    private User user;

    @Mock
    private ArrayList<Integer> lista;

    @Autowired
    private UserRepository repository;

    @org.junit.Test
    public void returnUser(){
//        User user1 = Mockito.mock(User.class);
        Mockito.when(user.getUserName()).thenReturn("test");
    }

    @org.junit.Test
    public void ArraySize100(){
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        System.out.println("index: " + lista1.get(0));
        System.out.println(lista.size());
//        Mockito.when(lista.add(10)).thenReturn(Assert.assertEquals(Mockito.any(), lista.get(0)));
        System.out.println("index: " + lista.get(0));
        Mockito.when(lista.size()).thenReturn(100);
        System.out.println(lista.size());
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
        Assert.assertEquals(0, user.getId());

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
        System.out.println("Teste finalizado");
    }

}
