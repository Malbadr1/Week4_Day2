public class BankAccount {
    private String customerName ;
     private  double accountBalance;

    public BankAccount(String customerName, double initialAccountBalance) {

        if (customerName.equals("") || customerName == null)
            throw new IllegalArgumentException("customer Name not defined");
        if (initialAccountBalance < 0)
            throw new IllegalArgumentException("initial Account Balance must be non-negative");
        this.customerName = customerName;
        this.accountBalance = initialAccountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void withdraw(int amount) throws Exception{
        if (amount >accountBalance) {
            throw new Exception(String.format("Current balance %d is less than requested amount %d", accountBalance, amount)); }
   accountBalance = accountBalance - amount;
    }
    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(String.format("Invalid deposit amount %s", amount));
        }
    }


}
