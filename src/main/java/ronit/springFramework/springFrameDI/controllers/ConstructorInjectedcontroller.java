package ronit.springFramework.springFrameDI.controllers;

import org.springframework.stereotype.Controller;
import ronit.springFramework.springFrameDI.services.GreetingSerices;

@Controller
public class ConstructorInjectedcontroller {
    private final GreetingSerices greetingSerices;

    public ConstructorInjectedcontroller(GreetingSerices greetingSerices) {
        this.greetingSerices = greetingSerices;
    }

    public String getGreeting() {
        return greetingSerices.sayGreeting();
    }
}
