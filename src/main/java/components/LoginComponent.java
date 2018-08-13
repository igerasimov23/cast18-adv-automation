package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginComponent {
    private WebDriver driver;

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("input[value='Log In']");


    public LoginComponent(WebDriver driver) {
        this.driver = driver;
    }


    public void setUsername(String userName) {
       driver.findElement(usernameField).sendKeys(userName);
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginBtn() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String pasword) {
        setUsername(username);
        setPasswordField(pasword);
        clickLoginBtn();
    }
}
