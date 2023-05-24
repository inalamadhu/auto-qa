package auto;

import core.config.BaseTest;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class SmokeTest extends BaseTest {

    @Test(groups={"gridTable"})
    public void gridTable() throws IOException {
        WebDriver driver  = getDriver();
        WebElement elm = driver.findElement(By.cssSelector(".tsc_table_s13"));
        String str = elm.findElement(By.xpath("//span[text()='Taipei']/parent::td/parent::tr/th")).getText();
        // elm.findElement(By.xpath("//span[text()='Taipei']/parent::td/parent::tr/th")).getText()
        System.out.println(str);


    }


}
