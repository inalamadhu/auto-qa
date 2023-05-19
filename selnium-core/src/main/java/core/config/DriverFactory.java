package core.config;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public enum DriverType implements DriverSetup{
        FIREFOX{
            @Override
            public WebDriver getWebDriver() {
                return null;
            }

            @Override
            public DesiredCapabilities getDesiredCapabilities() {
                return null;
            }
        },
        CHROME{
            @Override
            public WebDriver getWebDriver() {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/resources/chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                return driver;
            }

            @Override
            public DesiredCapabilities getDesiredCapabilities() {
                ChromeOptions options = new ChromeOptions();
                DesiredCapabilities capabilities = new DesiredCapabilities();
                return capabilities;
            }
        };



        public WebDriver instantiateDriver(String url){
            WebDriver driver = getWebDriver();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            return driver;
        }

    }

    public DriverType getDriverType(String browser){
        return DriverType.valueOf(browser);
    }



}
