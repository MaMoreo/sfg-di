package com.burncity.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import com.burncity.sfgdi.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService service;
	
	public MyController(GreetingService service) {
		super();
		this.service = service;
	}

	public String sayHello() {
		return service.sayGreeting();
	}
}
