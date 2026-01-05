package Week9;

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountholderName, double balance, double overdraftLimit) {
        super(accountNumber, accountholderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}