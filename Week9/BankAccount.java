package Week9;

class BankAccount {
    int accountNumber;
    String accountholderName;
    double balance;

    public BankAccount(int accountNumber, String accountholderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountholderName = accountholderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}