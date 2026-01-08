package Week10;

public class ExamApp {
    public static void main(String[] args) {
        ScienceStudent s1 = new ScienceStudent(301, "Kushal", 45);
        ManagementStudent m1 = new ManagementStudent(302, "Muthhi", 38);

        System.out.println(s1);
        System.out.println(s1.calculateResult());
        System.out.println(s1.calculateResult(10));

        System.out.println(m1);
        System.out.println(m1.calculateResult());
        System.out.println(m1.calculateResult(5));
    }
}
