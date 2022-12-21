package ronit.springFramework.springFrameDI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ronit.springFramework.springFrameDI.services.GreetingSerices;

@Controller
public class SetterInjectedController {
    @Autowired
    private GreetingSerices greetingSerices;

    public void setGreetingSerices(GreetingSerices greetingSerices) {
        this.greetingSerices = greetingSerices;
    }

    public String getGreetings() {
        return greetingSerices.sayGreeting();
    }
}
