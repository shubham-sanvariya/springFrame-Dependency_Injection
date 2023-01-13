package ronit.springFramework.springFrameDI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import ronit.services.GreetingSerices;

@Controller
public class PropertyinjectedController {
    @Qualifier("propertyinjectedGreetingService")
    @Autowired
    public GreetingSerices greetingSerices;

    public String getGreetings() {
        return greetingSerices.sayGreeting();
    }
}
