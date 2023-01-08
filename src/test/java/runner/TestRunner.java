package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"stepDefinitions","HooksPkg","Pages"},
        plugin = {"pretty","junit:Report/cucumber-results.xml","html:Report/cucumber-results.html"},
        dryRun = true,
        monochrome = true,
        publish = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
