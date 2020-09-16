package com.burncity.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.burncity.sfgdi.controllers.injection.PropertyInjectedController;
import com.burncity.sfgdi.services.injection.PropertyGreetingServiceImpl;

class PropertyInjectedControllerTest {

	private PropertyInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.service = new PropertyGreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		assertTrue(controller.getGreeting().equals("Hello World from Property"));
	}

}
