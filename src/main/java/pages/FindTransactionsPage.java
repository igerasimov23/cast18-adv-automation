package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FindTransactionsPage extends Page{

    public FindTransactionsPage(WebDriver driver) {
        super(driver);
    }

    private By selectAccountDropdown = By.id("accountId");
    private By transactionId = By.id("criteria.transactionId");
    private By findTransactionByIdButton = By.xpath("//*[@ng-click=\"criteria.searchType = 'ID'\"]");

    public void selectAccount(String accountId) {
        Select dropdown = new Select(driver.findElement(selectAccountDropdown));
        dropdown.selectByVisibleText(accountId);
    }

    public void setTransactionId(String transactionId) {
        driver.findElement(this.transactionId).sendKeys(transactionId);
    }

    public TransactionResultsPage clickFindTransactioButton() {
        driver.findElement(findTransactionByIdButton).click();
        return new TransactionResultsPage(driver);
    }


    public TransactionResultsPage findTransactionById(String accountNumber, String transactionId) {
        selectAccount(accountNumber);
        setTransactionId(transactionId);
        return clickFindTransactioButton();
    }
}
