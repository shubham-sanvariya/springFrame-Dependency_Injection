package ronit.springFramework.springFrameDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ronit.springFramework.springFrameDI.controllers.ConstructorInjectedcontroller;
import ronit.springFramework.springFrameDI.controllers.MyController;
import ronit.springFramework.springFrameDI.controllers.PropertyinjectedController;
import ronit.springFramework.springFrameDI.controllers.SetterInjectedController;

@SpringBootApplication
public class SpringFrameDiApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringFrameDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("-------Property");
		PropertyinjectedController propertyinjectedController = (PropertyinjectedController) ctx.getBean("propertyinjectedController");

		System.out.println(propertyinjectedController.getGreetings());

		System.out.println("-------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreetings());

		System.out.println("-------Constructor");

		ConstructorInjectedcontroller constructorInjectedcontroller = (ConstructorInjectedcontroller) ctx.getBean("constructorInjectedcontroller");

	}

}
