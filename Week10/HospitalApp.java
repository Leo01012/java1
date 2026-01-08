package Week10;

public class HospitalApp {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(1, "Dr. Badhnasib", "Cardiology", 2000);
        Nurse n1 = new Nurse(2, "Nurse Nuksan", "Night", 1500);

        System.out.println(d1);
        System.out.println("Doctor Salary: " + d1.calculateSalary());
        System.out.println("Doctor Salary with emergencies: " + d1.calculateSalary(3));

        System.out.println(n1);
        System.out.println("Nurse Salary: " + n1.calculateSalary());
    }
}
