package com.burncity.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.burncity.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

	private SetterInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setService( new GreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
		assertTrue(controller.getGreeting().equals("Hello World"));
	}

}
