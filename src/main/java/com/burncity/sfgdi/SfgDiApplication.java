package com.burncity.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.burncity.sfgdi.controllers.MyController;
import com.burncity.sfgdi.controllers.injection.ConstructorInjectedController;
import com.burncity.sfgdi.controllers.injection.PropertyInjectedController;
import com.burncity.sfgdi.controllers.injection.SetterInjectedController;
import com.burncity.sfgdi.controllers.profile.I18nController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
		
		MyController ctrl = (MyController) applicationContext.getBean("myController");
		System.out.println("\nOriginal --");
		System.out.println(ctrl.sayHello());
		
		System.out.println("\nProperty --");
		PropertyInjectedController pCtrl = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(pCtrl.getGreeting());
		
		System.out.println("\nSetter --");
		SetterInjectedController sCtrl = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(sCtrl.getGreeting());
		
		System.out.println("\nConstructor --");
		ConstructorInjectedController cCtrl = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(cCtrl.getGreeting());
		
		I18nController i18nCtrl = (I18nController) applicationContext.getBean("i18nController");
		System.out.println("\ni18n --");
		System.out.println(i18nCtrl.sayHello());
	}

}
