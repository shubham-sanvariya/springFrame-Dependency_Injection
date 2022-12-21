package ronit.springFramework.springFrameDI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ronit.springFramework.springFrameDI.services.GreetingSerices;

@Controller
public class PropertyinjectedController {
    @Autowired
    public GreetingSerices greetingSerices;

    public String getGreetings() {
        return greetingSerices.sayGreeting();
    }
}
