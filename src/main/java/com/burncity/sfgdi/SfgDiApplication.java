package com.burncity.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.burncity.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
		
		MyController ctrl = (MyController) applicationContext.getBean("myController");
		ctrl.sayHello();
		
	}

}
