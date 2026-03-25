package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    WebDriver driver;

    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.id("login");

    public LoginTest(WebDriver driver){
        this.driver = driver;
    }

    public void login(String user, String pass){
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}
