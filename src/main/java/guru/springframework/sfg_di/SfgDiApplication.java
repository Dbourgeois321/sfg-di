package guru.springframework.sfg_di;

import guru.springframework.sfg_di.controllers.ConstructerInjectedController;
import guru.springframework.sfg_di.controllers.PropertyInjectedController;
import guru.springframework.sfg_di.controllers.SetterInjectedController;
import guru.springframework.sfg_di.controllers.myController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Properties;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		myController myController = (myController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);
		System.out.println("--------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println("--------- Setter");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------- Constructor");

		ConstructerInjectedController constructerInjectedController = (ConstructerInjectedController) ctx.getBean("constructerInjectedController");
		System.out.println(constructerInjectedController.getGreeting());
	}

}
