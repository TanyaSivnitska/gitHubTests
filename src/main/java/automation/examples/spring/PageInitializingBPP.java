package automation.examples.spring;

import automation.examples.framework.driver.DriverProvider;
import automation.examples.pages.AbstractLoadable;
import automation.examples.pages.Page;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PageInitializingBPP implements BeanPostProcessor {

  @Autowired
  DriverProvider driverProvider;

  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    if (bean instanceof AbstractLoadable) {
      PageFactory.initElements(driverProvider.getInstance(), bean);
    }
    return bean;
  }

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    return bean;
  }
}
