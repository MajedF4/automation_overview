package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BasePage {
    WebDriver driver;

    public String myUrl = "https://suite8demo.suiteondemand.com/#/Login";

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(myUrl);
    }



    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
