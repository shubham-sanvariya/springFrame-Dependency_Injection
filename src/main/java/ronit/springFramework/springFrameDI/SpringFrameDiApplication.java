package ronit.springFramework.springFrameDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ronit.springFramework.springFrameDI.controllers.MyController;

@SpringBootApplication
public class SpringFrameDiApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringFrameDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
