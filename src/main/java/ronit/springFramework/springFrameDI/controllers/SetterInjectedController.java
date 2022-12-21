package ronit.springFramework.springFrameDI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ronit.springFramework.springFrameDI.services.GreetingSerices;

@Controller
public class SetterInjectedController {
    @Qualifier("setterinjectedGreetingService")
    @Autowired
    private GreetingSerices greetingSerices;

    public void setGreetingServices(GreetingSerices greetingSerices) {
        this.greetingSerices = greetingSerices;
    }

    public String getGreetings() {
        return greetingSerices.sayGreeting();
    }
}
