package tests;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;
    public static final String PAGE_URI = "https://www.saucedemo.com/";

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(PAGE_URI);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        loginPage.login("standard_user", "secret_sauce");
        String expectedUrl = PAGE_URI + "inventory.html";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }

    @Test
    public void testUnsuccessfulLogin() {
        loginPage.login("invalidUsername", "invalidPassword");
        String expectedUrl = PAGE_URI;
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals("Invalid username or password.", errorMessage);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
