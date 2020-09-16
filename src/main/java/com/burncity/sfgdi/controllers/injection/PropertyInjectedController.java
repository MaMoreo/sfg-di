package com.burncity.sfgdi.controllers.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.burncity.sfgdi.services.GreetingService;

/**
 * This simulates the Dependency Injection that Spring makes
 *  injecting the service in a public field (property)
 */
@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("propertyGreetingServiceImpl")
	public GreetingService service;

	public String getGreeting() {
		return service.sayGreeting();
	}
}
