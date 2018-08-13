package pages;

import components.AccountServiceMenu;
import components.LoginComponent;
import org.openqa.selenium.WebDriver;

public class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        new LoginComponent(driver).login(username, password);
    }

    public FindTransactionsPage navigateToFindTransaction() {
        return new AccountServiceMenu(driver).clickFindTransactionLink();
    }
}
