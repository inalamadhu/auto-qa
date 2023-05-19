package core.config;

import com.google.inject.AbstractModule;
import org.openqa.selenium.WebDriver;

public class GuiceWebDriver extends AbstractModule {

    @Override
    protected void configure() {
        WebDriver driver = BaseTest.getDriver();
        bind(WebDriver.class).toInstance(driver);
    }
}
