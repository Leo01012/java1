package Week10;

class ManagementStudent extends Student {
    public ManagementStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        return super.calculateResult() + 
               " | Management Evaluation: " + (getMarks() >= 40 ? "Pass" : "Fail");
    }

    public String calculateResult(int graceMarks) {
        double finalMarks = getMarks() + graceMarks;
        return "Management Evaluation with Grace: " + (finalMarks >= 40 ? "Pass" : "Fail");
    }
}
