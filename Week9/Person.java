package Week9;

class Person {
    int id;
    String name;
    double basicSalary;
    static String collegeName = "Informatics College";

    public Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateAnnualSalary() {
        return basicSalary * 12;
    }
}