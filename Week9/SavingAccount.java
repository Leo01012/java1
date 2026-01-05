package Week9;

class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(int accountNumber, String accountholderName, double balance, double interestRate) {
        super(accountNumber, accountholderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return super.getBalance() * interestRate / 100;
    }
}