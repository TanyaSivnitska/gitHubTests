package automation.examples.pages.impl;

import automation.examples.pages.AbstractLoadable;
import automation.examples.pages.impl.components.MenuComponent;
import cucumber.api.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GitHubRepositoryPage extends AbstractLoadable {

  @Autowired
  private GitHubPage gitHubPage;
  @Autowired
  private MenuComponent menuComponent;

  @Value("${repository.name}")
  private String repositoryName;

  @FindBy(xpath = "//input[@aria-label='Find a repository…']")
  private WebElement repositoryInput;

  @FindBy(xpath = "//img[@class='avatar ']")
  private WebElement menuImage;

  public void waitUntilLoaded() {
    getDriverWait().until(ExpectedConditions.visibilityOf(repositoryInput));
  }

  public void searchRepository() {
    driverProvider.getInstance().findElement(getRepositoryPath());
  }

  public void signOutFromGitHub() {
    getDriverWait().until(ExpectedConditions.visibilityOf(menuImage));
    menuImage.click();
    menuComponent.waitUntilLoaded();
    menuComponent.clickSignOut();
    gitHubPage.waitUntilLoaded();
  }

  private By getRepositoryPath() {
    return new By.ByXPath("//div[@class='js-repos-container']//span[@title='" + repositoryName + "']");
  }
}
