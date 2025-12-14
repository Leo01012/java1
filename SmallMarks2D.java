
/**
 * Write a description of class SmallMarks2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SmallMarks2D
{
    public static void main(String[] args){
        int marks[][]={
            {80, 75},
            {90, 85}
        };
        System.out.println("Marks Table:");
        System.out.println("Student\tNepali\tEnglish");
        for (int i=0; i<marks.length; i++){
            System.out.println("Student" + (i+1) + "\t");
            for (int j=0; j<marks[i].length; j++){
                System.out.println(marks[i][j] + "\t");
            }
        }
        System.out.println();
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            System.out.println("Student " + (i + 1) + ": " + total);
        }
    }
}