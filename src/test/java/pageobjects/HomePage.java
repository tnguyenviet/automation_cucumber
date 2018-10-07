package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends AbstractPageObject {

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Add note']")
    private static WebElement addNoteButton;

    @FindBy(id = "my-notes-page")
    public static WebElement myNotesPage;

    @FindBy(xpath = "//input[@name='note.title']")
    public static WebElement noteTile;

    @FindBy(xpath = "//textarea[@name='note.description']")
    public static WebElement noteDescription;


    public static void clickAddNoteButton(){
        addNoteButton.isDisplayed();
        addNoteButton.click();
    }



}
