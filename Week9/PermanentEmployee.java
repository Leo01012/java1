package Week9;

class PermanentEmployee extends Employee {
    double hra;
    double da;

    public PermanentEmployee(int employeeId, String name, double basicSalary, double hra, double da) {
        super(employeeId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    public double calculateTotalSalary() {
        return basicSalary + hra + da + calculateBonus();
    }

    public void displayPermanentEmployee() {
        displayEmployee();
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
        System.out.println("Bonus: $" + calculateBonus());
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }
}