package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    WebDriver driver;


    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.name("username");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void login_operation(String name, String pass) throws InterruptedException {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(name);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
        Thread.sleep(5000);
    }


}
