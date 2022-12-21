package ronit.springFramework.springFrameDI.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyinjectedGreetingService implements GreetingSerices {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
