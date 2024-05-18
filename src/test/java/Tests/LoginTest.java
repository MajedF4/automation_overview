package Tests;

import org.testng.annotations.Test;
import pages.Login;

public class LoginTest extends BasePage{

    public String name = "will";
    public String pass = "will";
    public String invalidPass = "jjjjjdlfknmelfjek";

    @Test
    public void verify_valid_login() throws InterruptedException {
        Login login = new Login(driver);
        login.login_operation(name, pass);
    }

    @Test
    public void verify_valid_name_invalid_password_login() throws InterruptedException {
        Login login = new Login(driver);
        login.login_operation(name, invalidPass);
    }
}
