
/**
 * Write a description of class MiniSeating2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniSeating2D
{
    public static void main(String[] args){
        String seats[][] = new String[2][3];
        seats[0][0]= "Hari";
        seats[0][1]="Ram";
        seats[0][2]="Shyam";
        seats[1][0]="null";
        seats[1][1]="null";
        seats[1][2]="null";
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col] == null) {
                    System.out.print("empty");
                } else {
                    System.out.print(seats[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}