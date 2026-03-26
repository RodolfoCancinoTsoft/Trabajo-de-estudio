package tests;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginTest {

    @Test
    public void testLogin() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://example.com/login");

        LoginPage login = new LoginPage(driver);
        login.login("admin", "1234");

        driver.quit();
    }


}
