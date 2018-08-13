package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.FindTransactionsPage;

public class AccountServiceMenu {
    private WebDriver driver;
    public AccountServiceMenu(WebDriver driver) {
        this.driver = driver;
    }

    private By findTransactinLink = By.linkText("Find Transactions");
    public FindTransactionsPage clickFindTransactionLink() {
        driver.findElement(findTransactinLink).click();
        return new FindTransactionsPage(driver);
    }
}
