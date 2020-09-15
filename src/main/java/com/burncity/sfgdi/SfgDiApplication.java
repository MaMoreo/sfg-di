package com.burncity.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.burncity.sfgdi.controllers.ConstructorInjectedController;
import com.burncity.sfgdi.controllers.MyController;
import com.burncity.sfgdi.controllers.PropertyInjectedController;
import com.burncity.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
		
		MyController ctrl = (MyController) applicationContext.getBean("myController");
		ctrl.sayHello();
		
		System.out.println("Property --");
		PropertyInjectedController pCtrl = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(pCtrl.getGreeting());
		
		System.out.println("Setter --");
		SetterInjectedController sCtrl = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(sCtrl.getGreeting());
		
		System.out.println("Constructor --");
		ConstructorInjectedController cCtrl = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(cCtrl.getGreeting());
		
	}

}
