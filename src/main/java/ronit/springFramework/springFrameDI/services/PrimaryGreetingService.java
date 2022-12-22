package ronit.springFramework.springFrameDI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingSerices {
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
