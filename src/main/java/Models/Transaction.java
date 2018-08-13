package Models;

import org.openqa.selenium.WebDriver;
import pages.Page;

public class Transaction{
    public Transaction() {
    }

    private String date;
    private String description;
    private String debit;
    private String credit;





    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }


    public Transaction(String date, String description, String debit, String credit) {
        setDate(date);
        setDescription(description);
        setDebit(debit);
        setCredit(credit);
    }

    @Override
    public boolean equals(Object transaction) {
       if(transaction == null) return false;
       if(! (transaction instanceof Transaction)) return false;

       Transaction t = (Transaction) transaction;

       if(!getDate().equals(t.getDate())) {
           System.out.println(String.format("Date %s does not equal %s", getDate(), t.getDate()));
           return false;
       }
       if(!getDescription().equals(t.getDescription())) {
           System.out.println(String.format("Description %s does not equal %s", getDescription(), t.getDescription()));
           return false;
       }

       if(!getDebit().equals(t.getDebit())) {
           System.out.println(String.format("debit %s does not equal %s", getDebit(), t.getDebit()));
           return false;
       }

       if(!getCredit().equals(t.getCredit())) {
           System.out.println(String.format("credit %s does not equal %s", getCredit(), t.getCredit()));
           return false;
       }
       return true;
    }
}
