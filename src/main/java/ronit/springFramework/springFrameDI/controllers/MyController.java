package ronit.springFramework.springFrameDI.controllers;

import org.springframework.stereotype.Controller;
import ronit.springFramework.springFrameDI.services.GreetingSerices;

@Controller
public class MyController {

    private final GreetingSerices greetingSerices;

    public MyController(GreetingSerices greetingSerices) {
        this.greetingSerices = greetingSerices;
    }

    public String sayHello() {
        return greetingSerices.sayGreeting();
    }
}
