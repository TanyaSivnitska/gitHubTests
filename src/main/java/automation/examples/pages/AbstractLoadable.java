package automation.examples.pages;

import automation.examples.framework.driver.DriverProvider;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractLoadable {
  private static final int DEFAULT_TIMEOUT = 10;

  @Autowired
  protected DriverProvider driverProvider;

  public abstract void waitUntilLoaded();

  protected WebDriverWait getDriverWait() {
    return new WebDriverWait(driverProvider.getInstance(), DEFAULT_TIMEOUT);
  }


}
