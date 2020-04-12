package automation.examples.framework.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("chrome")
public class ChromeDriverFactory implements DriverFactory {

  @Bean(destroyMethod = "quit")
  public WebDriver getDriver() {
    WebDriverManager.chromedriver().setup();
    return new ChromeDriver();
  }
}
