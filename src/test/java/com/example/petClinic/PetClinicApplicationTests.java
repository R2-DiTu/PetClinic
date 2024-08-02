package com.example.petClinic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.petClinic.controller.AppController;

@SpringBootTest
class PetClinicApplicationTests {

	@Autowired
	AppController appController;
	
	@Test
	void contextLoads() {
		assertThat(appController).isNotNull();
	}

}
