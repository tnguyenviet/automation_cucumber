package step_definitions;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.gl.E;
import pageobjects.HomePage;

public class HomePageSteps extends AbstractStepDefinition {


    @Then("^I am at Home page$")
    public void at_home_page() throws Exception{
        ssAssert.assertTrue(HomePage.myNotesPage.isDisplayed());
    }

    @When("^I click on Add Note button$")
    public void click_add_note(){
        HomePage.clickAddNoteButton();
    }

    @And("^I enter text \"([^\"]+)\" to (title|description) field$")
    public void enterTextToTextBox(String text,String field ){
        if (field.equals("title")){
            HomePage.noteTile.sendKeys(text);}
        if (field.equals("description")){
            HomePage.noteDescription.sendKeys(text);
        }
        else {
            logger.info("Invalid input field");
        }
        }

}
