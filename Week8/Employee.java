package Week8;

public class Employee
{
    private double basicSalary;
    
    public Employee(double basicSalary){
        this.basicSalary=basicSalary;
    }
    
    public double calculateGrossSalary(){
        return basicSalary + (0.20 * basicSalary);
    }
    
    public double getBasicSalary(){
        return basicSalary;
    }
}