package automation.examples.stepdefinitions;

import automation.examples.pages.impl.GitHubRepositoryPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class GitHubRepositoryPageSteps {

  @Autowired
  private GitHubRepositoryPage gitHubRepositoryPage;

  @Given("check Repository Page is opened")
  public void openGitHubPage() {
    gitHubRepositoryPage.waitUntilLoaded();
  }

  @Then("check needed repository is present")
  public void checkNeededRepositoryIsPresent() {
    gitHubRepositoryPage.searchRepository();
  }

  @Then("Sign out from GitHub")
  public void signOutFromGitHub() {
    gitHubRepositoryPage.signOutFromGitHub();
  }
}
