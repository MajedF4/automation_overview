package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    WebDriver driver;
    Wait<WebDriver> wait;


    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.id("login-button");
    By homePageLocator = By.id("tab0");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void login_operation(String name, String pass) throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(username).isDisplayed());
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(name);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }

    public boolean is_home_page_displayed(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       return wait.until(d -> driver.findElement(homePageLocator).isDisplayed());
    }


}
