package automation.examples.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "automation.examples")
@PropertySource(value = "classpath:testconfig.properties")
public class ApplicationConfig {

}
