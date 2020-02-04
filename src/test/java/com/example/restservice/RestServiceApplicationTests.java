package com.example.restservice;

import com.example.restservice.user.api.create.UserCreateController;
import com.example.restservice.user.domain.user.User;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootTest
@SpringBootConfiguration
class RestServiceApplicationTests extends SpringBootServletInitializer {

	@Test
	void contextLoads() {
	}

}
