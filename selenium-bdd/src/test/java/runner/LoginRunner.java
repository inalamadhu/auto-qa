package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/resources/features/LoginTest.feature",
                    glue = {"steps"},
                    monochrome = true,
                    tags = "@Sanity",
                    plugin = {"pretty", "html:target/cucumber-reports/cucumber-html-report.html",  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class LoginRunner extends AbstractTestNGCucumberTests {

/*    @Override
    @DataProvider (parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }*/
}
