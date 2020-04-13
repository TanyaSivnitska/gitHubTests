package automation.examples.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@Configuration
@ComponentScan(basePackages = "automation.examples")
@PropertySource(value = "classpath:testconfig.properties")
public class ApplicationConfig {

}
