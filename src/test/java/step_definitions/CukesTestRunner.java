package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        tags = {},
        features = "classpath:features",
        plugin = { "pretty", "html:target/reports/cucumber-html-report"}
)
public class CukesTestRunner extends AbstractTestNGCucumberTests {

}
