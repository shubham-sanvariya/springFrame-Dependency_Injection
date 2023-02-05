package ronit.springFramework.springFrameDI.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import ronit.springFramework.springFrameDI.exampleBeans.FakeDataSource;
import ronit.springFramework.springFrameDI.exampleBeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {

    @Value("${shubh.username}")
    String user;
    @Value("${shubh.password}")
    String password;
    @Value("${shubh.dburl}")
    String url;

    @Value("${shubh.jms.username}")
    String jmsUsername;

    @Value("${shubh.jms.password}")
    String jmsPassword;

    @Value("${shubh.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

}
