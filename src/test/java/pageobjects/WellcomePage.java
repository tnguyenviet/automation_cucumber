package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tinhnguyen on 10/1/2018.
 */
public class WellcomePage extends AbstractPageObject {

    public WellcomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id='welcome-page']//button[contains(@class,'button-login')]")
    public static WebElement showLoginPageButton;

}
