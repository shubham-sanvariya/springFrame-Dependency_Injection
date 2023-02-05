package ronit.springFramework.springFrameDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.core.env.Environment;
import ronit.springFramework.springFrameDI.controllers.*;
import ronit.springFramework.springFrameDI.exampleBeans.FakeDataSource;
import ronit.springFramework.springFrameDI.exampleBeans.FakeJmsBroker;

@SpringBootApplication
public class SpringFrameDiApplication {


	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringFrameDiApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUser());

//		System.out.println(controller.hello());
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

	}

}
