package automation.examples.stepdefinitions;

import automation.examples.pages.impl.GitHubPage;
import automation.examples.spring.ApplicationConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = ApplicationConfig.class)
public class GitHubSteps {

  @Autowired
  private GitHubPage gitHubPage;

  @Given("open GitHub page")
  public void openGitHubPage() {
   gitHubPage.open();
  }

  @When("open login form")
  public void openLoginForm() {
    gitHubPage.openLoginForm();
  }
}
