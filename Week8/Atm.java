package Week8;

public class Atm
{
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123", 100000, "Leo");
        
        System.out.println("Account Holder: " + account.getName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());
        
        account.deposit(50000);
        System.out.println("After Deposit: " + account.getBalance());

        boolean success = account.withdraw(30000);
        if (success) {
            System.out.println("Withdrawal Successful. Balance: " + account.getBalance());
        } else {
            System.out.println("Withdrawal Failed. Insufficient Balance.");
        }
        
        success = account.withdraw(20000);
        if (success) {
            System.out.println("Withdrawal Successful. Balance: " + account.getBalance());
        } else {
            System.out.println("Withdrawal Failed. Insufficient Balance.");
        }

    }   
}