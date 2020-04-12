package automation.examples.pages.components;

import automation.examples.pages.AbstractLoadable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

@Component
public class LoginForm extends AbstractLoadable {

  @FindBy(id = "login_field")
  private WebElement loginField;

  @FindBy(id = "password")
  private WebElement passwordField;

  @FindBy(name = "commit")
  private WebElement signInButton;

  public void waitUntilLoaded() {
    getDriverWait().until(ExpectedConditions.visibilityOf(loginField));
    getDriverWait().until(ExpectedConditions.visibilityOf(passwordField));
  }

  public void login() {
    loginField.sendKeys();
    passwordField.sendKeys();
    signInButton.click();
  }
}
