package ronit.springFramework.springFrameDI.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import ronit.services.GreetingSerices;

@Controller
public class I18nController {
    private final GreetingSerices greetingSerices;

    public I18nController(@Qualifier("i18nService") GreetingSerices greetingSerices) {
        this.greetingSerices = greetingSerices;
    }

    public String sayHello() {
        return greetingSerices.sayGreeting();
    }
}
