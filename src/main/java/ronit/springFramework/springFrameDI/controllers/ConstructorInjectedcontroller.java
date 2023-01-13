package ronit.springFramework.springFrameDI.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import ronit.services.GreetingSerices;

@Controller
public class ConstructorInjectedcontroller {
    private final GreetingSerices greetingSerices;

    public ConstructorInjectedcontroller(@Qualifier("constructorGreetingServices") GreetingSerices greetingSerices) {
        this.greetingSerices = greetingSerices;
    }

    public String getGreeting() {
        return greetingSerices.sayGreeting();
    }
}
