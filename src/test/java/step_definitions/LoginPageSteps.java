package step_definitions;

import cucumber.api.java.en.When;
import pageobjects.LoginPage;

public class LoginPageSteps extends AbstractStepDefinition {


    @When("^I login with username \"([^\"]+)\" and password \"([^\"]+)\"$")
    public void loginAs(String username, String password){
        LoginPage.loginAs(username,password);
    }




}
