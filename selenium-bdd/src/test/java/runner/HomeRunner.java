package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/resources/features/HomeTest.feature",
                    glue = {"steps"},
                    monochrome = true,
                    plugin = {"pretty", "html:target/cucumber-reports/cucumber-html-report.html",  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class HomeRunner extends AbstractTestNGCucumberTests {

/*    @Override
    @DataProvider (parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }*/
}
