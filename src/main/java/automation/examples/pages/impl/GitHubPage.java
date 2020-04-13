package automation.examples.pages.impl;

import automation.examples.pages.AbstractLoadable;
import automation.examples.pages.Page;
import automation.examples.pages.impl.components.LoginForm;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GitHubPage extends AbstractLoadable implements Page {

  @Autowired
  private LoginForm loginForm;

  @Value("${base.url}")
  private String baseUrl;

  @FindBy(xpath = "//a[@href='/login']")
  private WebElement signInLink;

  @FindBy(xpath = "//a[text()='Sign up']")
  private WebElement signUpLink;

  @FindBy(id = "password")
  private WebElement password;

  public void open() {
    driverProvider.getInstance().get(baseUrl);
    waitUntilLoaded();
  }

  public void openLoginForm() {
    signInLink.click();
    loginForm.waitUntilLoaded();
  }

  public void waitUntilLoaded() {
    getDriverWait().until(ExpectedConditions.visibilityOf(signInLink));
  }
}
