package automation.examples.pages.impl.components;

import automation.examples.pages.AbstractLoadable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoginForm extends AbstractLoadable {

  @Value("${login.email}")
  private String email;

  @Value("${login.password}")
  private String password;

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
    loginField.sendKeys(email);
    passwordField.sendKeys(password);
    signInButton.click();
  }
}
