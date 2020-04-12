package automation.examples.stepdefinitions;

import automation.examples.pages.impl.components.LoginForm;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginFormSteps {

  @Autowired
  private LoginForm loginForm;

  @When("login to GitHub")
  public void loginToGitHub() {
    loginForm.login();
  }
}
