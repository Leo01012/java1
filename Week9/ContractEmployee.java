package Week9;

class ContractEmployee extends Employee {
    int workingDays;

    public ContractEmployee(int employeeId, String name, double basicSalary, int workingDays) {
        super(employeeId, name, basicSalary);
        this.workingDays = workingDays;
    }

    public double calculateTotalSalary() {
        return basicSalary * workingDays;
    }

    public void displayContractEmployee() {
        displayEmployee();
        System.out.println("Working Days: " + workingDays);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }
}