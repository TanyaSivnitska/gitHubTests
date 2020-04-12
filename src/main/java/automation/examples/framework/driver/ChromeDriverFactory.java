package automation.examples.framework.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("chrome")
public class ChromeBrowser implements Browser {

  public WebDriver getDriver() {
    WebDriverManager.chromedriver().setup();
    return new ChromeDriver();
  }
}
