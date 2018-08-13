package tests;

import base.UITests;
import org.junit.Test;
import pages.FindTransactionsPage;
import Models.Transaction;
import pages.TransactionResultsPage;

import static org.junit.Assert.assertEquals;

public class TransactionTests extends UITests {

    @Test
    public void testFindTransactionById() {

        FindTransactionsPage searchPage = homePage.navigateToFindTransaction();

        TransactionResultsPage resultsPage = searchPage.findTransactionById("12345", "14143");

        assertEquals("Number of transactions is incorrect", 1, resultsPage.getNUmberOfTransactions());

        Transaction expectedTransaction = new Transaction("07-29-2018", "Bill Payment to Bank of America Visa", "$1000.00", "");

        Transaction actualTransaction = resultsPage.getTransactions().get(0);

        assertEquals("Transactions don't match", expectedTransaction, actualTransaction);




    }



}
