package automation.examples;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    glue="automation.examples",
    features = "src/test/resources"
)
public class CucumberRunner {

}
