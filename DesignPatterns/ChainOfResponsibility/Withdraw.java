package ChainOfResponsibility;

public class Withdraw {
    private int customerID;
    private double amount;
    private String currencyType;
    private int sourceAccountID;

    public Withdraw(int customerID, double amount, String currencyType, int sourceAccountID) {
        this.customerID = customerID;
        this.amount = amount;
        this.currencyType = currencyType;
        this.sourceAccountID = sourceAccountID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public int getSourceAccountID() {
        return sourceAccountID;
    }
}
