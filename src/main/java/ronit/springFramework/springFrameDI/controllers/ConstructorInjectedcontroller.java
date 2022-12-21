package ronit.springFramework.springFrameDI.controllers;

import ronit.springFramework.springFrameDI.services.GreetingSerices;

public class ConstructorInjectedcontroller {
    private final GreetingSerices greetingSerices;

    public ConstructorInjectedcontroller(GreetingSerices greetingSerices) {
        this.greetingSerices = greetingSerices;
    }

    public String getGreeting() {
        return greetingSerices.sayGreeting();
    }
}
