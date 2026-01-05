package Week9;

public class BankApp {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(401, "Charlie", 5000.0, 5.0);
        CurrentAccount ca = new CurrentAccount(402, "Diana", 2000.0, 1000.0);

        sa.deposit(1000.0);
        System.out.println("Saving Account Balance: $" + sa.getBalance());
        System.out.println("Interest: $" + sa.calculateInterest());

        boolean success = ca.withdraw(2500.0);
        System.out.println("Withdraw from Current Account: " + (success ? "Successful" : "Failed"));
        System.out.println("Current Account Balance: $" + ca.getBalance());
    }
}