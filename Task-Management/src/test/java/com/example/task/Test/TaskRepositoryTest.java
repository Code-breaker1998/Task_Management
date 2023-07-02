package com.example.task.Test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.task.Service.Userservice;
import com.example.task.entity.User;

import jakarta.transaction.Transactional;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class TaskRepositoryTest {

	@Autowired
	private Userservice servo;
	
	@Test
	@Transactional
	public void testEncode() {
		User username=servo.findEmail("durgesh@gmail.com");
		System.out.print(username);
		assertThat(username).isNotNull();
		
	}
}
