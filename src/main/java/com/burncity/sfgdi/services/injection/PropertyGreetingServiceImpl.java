package com.burncity.sfgdi.services.injection;

import org.springframework.stereotype.Service;

import com.burncity.sfgdi.services.GreetingService;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World from Property";
	}

}
