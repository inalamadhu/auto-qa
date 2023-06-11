package auto;

import core.config.BaseTest;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class SmokeTest extends BaseTest {


    @Test(groups={"gridTable"}, enabled = false)
    public void gridTable() throws IOException {
        WebDriver driver  = getDriver();
        WebElement elm = driver.findElement(By.cssSelector(".tsc_table_s13"));
        String str = elm.findElement(By.xpath("//span[text()='Taipei']/parent::td/parent::tr/th")).getText();
        // elm.findElement(By.xpath("//span[text()='Taipei']/parent::td/parent::tr/th")).getText()
        System.out.println(str);
    }


    @Test
    public void test1(ITestContext con){
        con.setAttribute("key1","var1");
        System.out.println("test1");
    }


    @Test
    public void test2(ITestContext con){
        con.setAttribute("key2","var2");
        System.out.println("test12");
    }


    @Test
    public void test3(ITestContext con){

        System.out.println(con.getAttribute("key2"));


    }




    @DataProvider(name="data")
    public Object[][] getData(){
        Object[][] obj = new Object[2][2];
        obj[0][0] = "test1";
        obj[0][1] = "test1";
        obj[1][0] = "test1";
        obj[1][1] = "test1";
        return obj;
    }


}
