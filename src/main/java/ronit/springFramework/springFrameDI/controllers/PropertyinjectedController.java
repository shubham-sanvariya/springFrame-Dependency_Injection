package ronit.springFramework.springFrameDI.controllers;

import ronit.springFramework.springFrameDI.services.GreetingSerices;

public class PropertyinjectedController {
    public GreetingSerices greetingSerices;

    public String getGreetings() {
        return greetingSerices.sayGreeting();
    }
}
