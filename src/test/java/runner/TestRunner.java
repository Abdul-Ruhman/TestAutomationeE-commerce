package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = "stepDefinitions",
        tags = "@smoke",
        plugin = {"pretty","html:test-output","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","junit:target/cucumber-results.xml"},
        dryRun = true,
        monochrome = true,
        publish = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
