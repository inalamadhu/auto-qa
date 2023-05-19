package core.config;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;


public class BaseTest {


    public static InheritableThreadLocal<WebDriver> threadDriver = new InheritableThreadLocal<WebDriver>();

    @BeforeMethod(alwaysRun=true)
    public void initializeDriver(){
        DriverFactory df = new DriverFactory();
        threadDriver.set(df.getDriverType("CHROME").instantiateDriver("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html"));

    }

    public static WebDriver getDriver(){
        return threadDriver.get();
    }



}
