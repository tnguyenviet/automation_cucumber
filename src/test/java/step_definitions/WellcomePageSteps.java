package step_definitions;

import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import pageobjects.WellcomePage;

public class WellcomePageSteps extends AbstractStepDefinition {

    private static String testAppUrl = "http://testapp.galenframework.com";

    @When("^I open test app website$")
    public void i_open_test_app_website() throws Throwable {
        driver.get(testAppUrl);
    }

    @When("^I click login$")
    public void navigate_to_practiceform_link() throws Throwable {
        WellcomePage.showLoginPageButton.isDisplayed();
        WellcomePage.showLoginPageButton.click();

    }

}
