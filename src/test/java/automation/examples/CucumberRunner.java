package automation.examples;

import automation.examples.spring.CustomTestExecutionListener;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(Cucumber.class)
@CucumberOptions(
    glue="automation.examples",
    features = "src/test/resources"
)
@TestExecutionListeners(value = {
    CustomTestExecutionListener.class,
    DependencyInjectionTestExecutionListener.class
})
public class CucumberRunner {

}
