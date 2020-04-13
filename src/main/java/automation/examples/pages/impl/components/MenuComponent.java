package automation.examples.pages.impl.components;


import automation.examples.pages.AbstractLoadable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

@Component
public class MenuComponent extends AbstractLoadable {

  @FindBy(xpath = "//details-menu//form[@class='logout-form']/button")
  private WebElement signOutLink;

  @FindBy(xpath = "//details-menu//a[text()='Your projects']")
  private WebElement yourProjectsLink;

  public void waitUntilLoaded() {
    getDriverWait().until(ExpectedConditions.visibilityOf(signOutLink));
    getDriverWait().until(ExpectedConditions.visibilityOf(yourProjectsLink));
  }

  public void clickSignOut() {
    signOutLink.click();
  }
}
