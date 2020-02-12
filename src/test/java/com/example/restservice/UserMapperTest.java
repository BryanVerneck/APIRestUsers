package com.example.restservice;

import com.example.restservice.user.api.common.UsersDto;
import com.example.restservice.user.api.common.UsersMapper;
import com.example.restservice.user.domain.user.User;
import org.junit.Assert;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class UserMapperTest {

    private UsersMapper mapper = Mappers.getMapper(UsersMapper.class);

    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        //given
        User user = new User();
        user.setUserName("test");
        user.setEmail("test@gmail.com");

        // when
        UsersDto destination = mapper.userToUserDto(user);

        // then
        assertEquals(user.getUserName(), destination.getUserName());
        assertEquals(user.getEmail(), destination.getEmail());
    }

    @Test
    public void givenDtoToUser_whenMaps_thenCorrect(){
        //given
        UsersDto dto = new UsersDto(1,"teste@gmail.com", "teste", "teste", "test", null);

        //when
        User user = mapper.toUsers(dto);

        //then
        Assert.assertEquals(dto.getUserName(), user.getUserName());
        assertEquals(dto.getEmail(), user.getEmail());
        assertEquals(dto.getFirstName(), user.getFirstName());
    }

}
