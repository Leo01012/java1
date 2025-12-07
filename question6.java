
/**
 * Write a description of class question6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question6
{
    public static void main(String[] args) {
        int i = 5;
        do {
            int num = 1; 
            do {
                System.out.print(num);
                num++;
            } while (num <= i);

            System.out.println(); 
            i--; 
        } while (i >= 1);
    }


}