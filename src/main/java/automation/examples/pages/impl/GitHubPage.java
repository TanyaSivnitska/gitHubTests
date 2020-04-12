package automation.examples.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

@Component
public class GitHubPage extends AbstractLoadable implements Page {

  @FindBy(xpath = "//a[@href='/login']")
  private WebElement signInLink;

  @FindBy(xpath = "//a[@href='/join?source=header-home']")
  private WebElement signUpLink;

  @FindBy(id = "password")
  private WebElement password;

  public void open() {
    driverProvider.getInstance().get("");
    getDriverWait().until(ExpectedConditions.visibilityOf(signInLink));
    getDriverWait().until(ExpectedConditions.visibilityOf(signUpLink));
  }

  public void openLoginForm() {
    signInLink.click();
  }
}
