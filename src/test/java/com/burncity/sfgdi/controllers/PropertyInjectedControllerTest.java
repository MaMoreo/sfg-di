package com.burncity.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.burncity.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	private PropertyInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.service = new GreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		assertTrue(controller.getGreeting().equals("Hello World"));
	}

}
