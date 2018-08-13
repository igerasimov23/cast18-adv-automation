package pages;

import Models.Transaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class TransactionResultsPage extends Page{

    private By table = By.id("transactionTable");

    public TransactionResultsPage(WebDriver driver) {
        super(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(table));
    }


    private WebElement findTable() {
        return driver.findElement(table);
    }

    public int getNUmberOfTransactions() {
        return getRows().size();
    }

    public List<Transaction> getTransactions() {
        List<Transaction> transactions = new ArrayList<Transaction>();
        List<WebElement> rows = getRows();
        for (WebElement row: rows) {
            Transaction t = new Transaction();
            List<WebElement> cells = row.findElements(By.tagName("td"));

            t.setDate(cells.get(0).getText());
            t.setDescription(cells.get(1).getText());
            t.setDebit(cells.get(2).getText());
            t.setCredit(cells.get(3).getText());

            transactions.add(t);
        }


        return transactions;
    }


    private List<WebElement> getRows() {
        return findTable().findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
    }



}
