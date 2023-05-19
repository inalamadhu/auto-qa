package auto;

import core.config.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {

    @Test(groups={"gridTable"})
    public void gridTable(){
        WebDriver driver  = getDriver();
        WebElement elm = driver.findElement(By.cssSelector(".tsc_table_s13"));
        String str = elm.findElement(By.xpath("//span[text()='Taipei']/parent::td/parent::tr/th")).getText();
        // elm.findElement(By.xpath("//span[text()='Taipei']/parent::td/parent::tr/th")).getText()
        System.out.println(str);
    }


}
