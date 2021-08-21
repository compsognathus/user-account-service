package com.jdc.demo.user.requests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jdc.demo.user.controllers.AccountsController;


@SpringBootTest
public class AccountsControllerTest {
	
	@Autowired
	private AccountsController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
    
    @Test
    void whenCallingAccountsController_msgText_thenReturnMsg() {
    	String inputMsg = "Hello";
    	String expected = "Accounts Service!:: Received " + inputMsg + "!";
    	assertThat(expected.equals(controller.msgText(inputMsg)));
    }
}
