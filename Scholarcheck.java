
/**
 * Write a description of class Scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Scholarcheck
{
    public static void main()
    {
        Scanner input = new Scanner (System.in);
        float GPA;
        float attendance;
        int attitude;
        System.out.println("Enter the GPA:");
        GPA = input.nextFloat();
        System.out.println("Enter the attendance:");
        attendance = input.nextFloat();
        System.out.println("Enter the attitude score:");
        attitude = input.nextInt();
        if (GPA > 3.2){
            if (attendance > 80f){
                if (attitude < 5){
                    System.out.println("You are eligible for scholarship");
                }
                else{
                    System.out.println("You are not eligible for scholarship because of bad attitude.");
                }
            }
            else{
                    System.out.println("You are not eligible for scholarship because of irregular attendance.");
                }
        }
        else {
                    System.out.println("You are not eligible for scholarship because of not enough grade.");
        }
    }
}