package Week9;

public class Payroll {
    public static void main(String[] args) {
        PermanentEmployee pe = new PermanentEmployee(301, "Alice", 30000.0, 5000.0, 4000.0);
        ContractEmployee ce = new ContractEmployee(302, "Bob", 1000.0, 20);

        System.out.println("=== Permanent Employee Info ===");
        pe.displayPermanentEmployee();

        System.out.println("\n=== Contract Employee Info ===");
        ce.displayContractEmployee();
    }
}