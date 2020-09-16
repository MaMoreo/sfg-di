package com.burncity.sfgdi.controllers.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.burncity.sfgdi.services.GreetingService;

/**
 * This simulates the Dependency Injection that Spring makes injecting the
 * service in a private field and using a constructor.
 * 
 * Notice the service here is FINAL.
 * 
 * This is the PREFERRED way.
 */
@Controller
public class ConstructorInjectedController {
	
	private final GreetingService service;

	// @Autowired  // This annotation is optional !  
	public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService service) {
		super();
		this.service = service;
	}

	/* Getters and Setters **/
	public GreetingService getService() {
		return service;
	}
	/**
	 * Calls the service
	 * @return
	 */
	public String getGreeting() {
		return service.sayGreeting();
	}
}
