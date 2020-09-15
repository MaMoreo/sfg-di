package com.burncity.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.burncity.sfgdi.services.ConstructorGreetingServiceImpl;

class ConstructorInjectedControllerTest {

	private ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
		assertTrue(controller.getGreeting().equals("Hello World from Constructor"));
	}

}
