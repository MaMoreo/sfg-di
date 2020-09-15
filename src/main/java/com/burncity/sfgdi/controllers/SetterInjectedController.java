package com.burncity.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.burncity.sfgdi.services.GreetingService;

/**
 * This simulates the Dependency Injection that Spring makes injecting the
 * service in a private field and using a setter.
 */
@Controller
public class SetterInjectedController {

	private GreetingService service;

	public String getGreeting() {
		return service.sayGreeting() + " Setter";
	}

	/* Getters and Setters **/
	public GreetingService getService() {
		return service;
	}

	@Autowired
	public void setService(GreetingService service) {
		this.service = service;
	}
}