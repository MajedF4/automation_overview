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

        username = (By) driver.findElement(username);
        password = driver.findElement(By.name("password"));
        loginBtn = driver.findElement(By.id("login-button"));
        username.clear();
        username.sendKeys(name);
        password.clear();
        password.sendKeys(pass);
        loginBtn.click();
        Thread.sleep(5000);
    }


}
