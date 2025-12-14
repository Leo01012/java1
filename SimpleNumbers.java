
/**
 * Write a description of class SimpleNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SimpleNumbers
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int n=input.nextInt();
        
        int[] score= new int[n];
        System.out.println("Enter the scores");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            score[i] = input.nextInt();
        }
        System.out.println("The scores entered are:");
        for (int scores: score){
            System.out.println(scores);
        }
        int sum=0;
        for(int scores: score){
            sum += scores;
        }
        System.out.println("The sum of the scores is: " + sum);
        
        double avg= (double) sum / n;
        System.out.println("The average of the scores is: " + avg);
        
        int highest=score[0];
        int lowest=score[0];
        for (int scores: score){
            if (scores> highest) highest = scores;
            if (scores< lowest) lowest = scores;
        }
        System.out.println("The highest score is " + highest);
        System.out.println("The lowest score is " + lowest);
    }
}