package ronit.springFramework.springFrameDI.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingSerices{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
