package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest extends BasePage{
    Login mylogin;
    public String name = "will";
    public String pass = "will";
    public String invalidPass = "jjjjjdlfknmelfjek";

    @Test
    public void verify_login_with_valid_username_and_password() throws InterruptedException {
        mylogin = new Login(driver);
        mylogin.login_operation(name, pass);
        mylogin.is_home_page_displayed();
        String actual_url = driver.getCurrentUrl();
        String excepted_url = "https://suite8demo.suiteondemand.com/#/home";
        Assert.assertEquals( actual_url, excepted_url);
    }

    @Test
    public void verify_login_with_invalid_username_and_password() throws InterruptedException {
        mylogin = new Login(driver);
        mylogin.login_operation(name, invalidPass);
    }
}
