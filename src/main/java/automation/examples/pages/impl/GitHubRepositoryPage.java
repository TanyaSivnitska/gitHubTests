package automation.examples.pages.impl;

import automation.examples.pages.AbstractLoadable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GitHubRepositoryPage extends AbstractLoadable {

  @Value("${repository.name}")
  private String repositoryName;

  @FindBy(xpath = "//input[@aria-label='Find a repository…']")
  private WebElement repositoryInput;

  public void waitUntilLoaded() {
    getDriverWait().until(ExpectedConditions.visibilityOf(repositoryInput));
  }

  public void logoutFromGitHub() {

  }

  public void searchRepository() {
    driverProvider.getInstance().findElement(getRepositoryPath());
  }

  private By getRepositoryPath() {
    return new By.ByXPath("//span[@title='" + repositoryName + "']");
  }
}
