package pageobjects;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageObject {
    public static WebDriver driver;

    public AbstractPageObject(WebDriver driver){
        AbstractPageObject.driver = driver;
    }

}
