package Week10;

class ScienceStudent extends Student {
    public ScienceStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        return super.calculateResult() + 
               " | Science Evaluation: " + (getMarks() >= 50 ? "Pass" : "Fail");
    }

    public String calculateResult(int graceMarks) {
        double finalMarks = getMarks() + graceMarks;
        return "Science Evaluation with Grace: " + (finalMarks >= 50 ? "Pass" : "Fail");
    }
}