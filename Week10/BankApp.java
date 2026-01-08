package Week10;

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(401, "Pathak", 50000);
        CurrentAccount ca = new CurrentAccount(402, "Prasai", 80000);

        System.out.println(sa);
        System.out.println("Savings Interest: " + sa.calculateInterest());
        System.out.println("Savings Interest with custom rate: " + sa.calculateInterest(0.05));

        System.out.println(ca);
        System.out.println("Current Interest: " + ca.calculateInterest());
        System.out.println("Current Interest with custom rate: " + ca.calculateInterest(0.04));
    }
}
