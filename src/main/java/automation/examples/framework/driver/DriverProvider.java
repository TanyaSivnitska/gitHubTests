package automation.examples.framework.driver;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DriverProvider {

  @Autowired
  DriverFactory driverFactory;

  private ThreadLocal<WebDriver> driverInstance = new ThreadLocal<WebDriver>();

  public WebDriver getInstance() {
    if (driverInstance.get() == null) {
      driverInstance.set(driverFactory.getDriver());
    }
    return driverInstance.get();
  }
}
