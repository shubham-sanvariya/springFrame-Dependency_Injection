package ronit.springFramework.springFrameDI.controllers;

import ronit.springFramework.springFrameDI.services.GreetingSerices;

public class SetterInjectedController {
    private GreetingSerices greetingSerices;

    public void setGreetingSerices(GreetingSerices greetingSerices) {
        this.greetingSerices = greetingSerices;
    }

    public String getGreetings() {
        return greetingSerices.sayGreeting();
    }
}
