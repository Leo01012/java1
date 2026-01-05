package Week9;

public class SchoolApp {
    public static void main(String[] args) {
        Teacher t = new Teacher(501, "Edward", 2000.0, "Math", 5000.0);
        Staff s = new Staff(502, "Fiona", 1500.0, 160, 20.0);

        System.out.println("Teacher Annual Salary: $" + t.calculateAnnualSalary());
        System.out.println("Staff Salary: $" + s.calculateSalary());
        System.out.println("College Name: " + Person.collegeName);
    }
}