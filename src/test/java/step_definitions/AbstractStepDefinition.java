package step_definitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.WellcomePage;
/**
 * The BaseTestPage class is used to set up variables and methods that
 * are common to all pages in the test.  For example, this is where you
 * can define driver and logger instead of in each Page Object file. *
 */
public class AbstractStepDefinition {

    public WebDriver driver;
    public AssertJUnit ssAssert;

    public AbstractStepDefinition(){
        driver = Hook.driver;
        PageFactory.initElements(driver, WellcomePage.class);
        PageFactory.initElements(driver, LoginPage.class);
        PageFactory.initElements(driver, HomePage.class);
    }

    // define a logger for messages.
    // Note the xxxxxx.class should always be the current class name
    protected static final Logger logger = LogManager.getLogger(AbstractStepDefinition.class);


}
