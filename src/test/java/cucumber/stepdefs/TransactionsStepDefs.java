package cucumber.stepdefs;

import Models.Transaction;
import base.UITests;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FindTransactionsPage;
import pages.TransactionResultsPage;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TransactionsStepDefs extends UITests {

    String accountId, transactionId;
    TransactionResultsPage resultsPage;

    @Given("my account id is (.*)")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Given("my transaction id is (.*)")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @When("I search for transaction by id")
    public void searchById() {
        FindTransactionsPage searchPage = homePage.navigateToFindTransaction();
         resultsPage = searchPage.findTransactionById(accountId, transactionId);
    }

    @Then("transactions are as follows")
    public void verifyTransactions(List<Transaction> expTransactions) {
        assertEquals("Transactions don't match", expTransactions, resultsPage.getTransactions());
    }
}
