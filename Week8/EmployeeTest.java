package Week8;
public class EmployeeTest
{
    public static void main(String[] args){
        Employee emp = new Employee(50000);
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Gross Salary: " + emp.calculateGrossSalary());

    }
}