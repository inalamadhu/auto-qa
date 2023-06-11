package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/resources/features",
                    glue = {"steps"},
                    monochrome = true,
                    plugin = {"pretty", "html:target/cucumber-reports/cucumber-html-report.html",  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests {

    @DataProvider (parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

}





