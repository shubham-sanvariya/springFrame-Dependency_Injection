package ronit.springFramework.springFrameDI.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServices implements GreetingSerices {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
