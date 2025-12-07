
/**
 * Write a description of class question9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class question9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int rev = 0;
        while (num > 0) {
            int digit = num % 10; 
            rev = rev * 10 + digit; 
            num = num / 10;      
        }
        System.out.println("Reversed number is " + rev);
        input.close();
    }
}