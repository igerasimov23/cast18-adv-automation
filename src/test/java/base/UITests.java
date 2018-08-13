package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Page;
import utils.Links;

public class UITests {

    private static WebDriver driver;
    protected static Page homePage;


    @BeforeClass
    public static void launchApplication() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        driver = new ChromeDriver();

        driver.get(Links.HOME);

        homePage = new Page(driver);

        login();

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }


    public static void login() {
        login("john", "demo");

    }

    public static void login (String username, String password) {
        homePage.login(username, password);
    }





}
