package com.burncity.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.burncity.sfgdi.controllers.injection.SetterInjectedController;
import com.burncity.sfgdi.services.injection.SetterGreetingServiceImpl;

class SetterInjectedControllerTest {

	private SetterInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setService( new SetterGreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
		assertTrue(controller.getGreeting().equals("Hello World from Setter"));
	}

}
