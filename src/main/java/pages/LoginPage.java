package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    private WebDriver driver;

    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage  enterUsername(String username) {
        WebElement usernameElement = driver.findElement(usernameInput);
        usernameElement.clear();
        usernameElement.sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordInput);
        passwordElement.clear();
        passwordElement.sendKeys(password);
        return this;
    }

    public void clickLoginButton() {
        WebElement loginBtn =  driver.findElement(loginButton);
        loginBtn.click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}

