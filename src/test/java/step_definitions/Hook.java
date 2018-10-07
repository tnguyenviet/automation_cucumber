package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;

public class Hook {

    public static WebDriver driver;

    @Before
    public void openBrowser() throws MalformedURLException{

        System.out.println("Open browser");
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void takeScreenshot(Scenario scenario){
        if (scenario.isFailed()){
            try{
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot,"images/png");
            }catch (WebDriverException somePlatformDonSupportScreenShoot){
                System.err.println(somePlatformDonSupportScreenShoot.getMessage());
            }
        }
        if (driver != null){
            driver.quit();
        }
        System.out.println("End Test Scenario:" + scenario.getName());
    }

}
