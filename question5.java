
/**
 * Write a description of class question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question5
{
     public static void main(String[] args) {
        int i = 1;
        do {
            int j = 5 - i;
            do {
                System.out.print(" ");
                j--;
            } while (j > 0);

            int num = 1; 
            do {
                System.out.print(num);
                num++;
            } while (num <= i);

            System.out.println();
            i++; 
        } while (i <= 5); 
    }


}