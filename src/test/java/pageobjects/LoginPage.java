package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tinhnguyen on 10/1/2018.
 */
public class LoginPage extends AbstractPageObject {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@name='login.username']")
    public static WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name='login.password']")
    public static WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id='login-page']//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='login-page']//button[text()='Cancel']")
    public WebElement cancelButton;

    public static void loginAs(String username, String password){
        usernameTextBox.isDisplayed();
        usernameTextBox.sendKeys(username);
        passwordTextBox.isDisplayed();
        passwordTextBox.sendKeys(password);
    }

}
