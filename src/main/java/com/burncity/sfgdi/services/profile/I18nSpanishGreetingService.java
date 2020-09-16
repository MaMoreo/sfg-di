package com.burncity.sfgdi.services.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.burncity.sfgdi.services.GreetingService;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hola Mundo - ES";
	}

}
