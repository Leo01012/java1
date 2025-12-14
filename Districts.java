
/**
 * Write a description of class Districts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Districts
{
    public static void main(String[] args){
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        System.out.println("The districts are:");
        for(int i=0; i< districts.length; i++){
            System.out.println(districts[i]);
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of districts:");
        int n= input.nextInt();
        input.nextLine();
        String[] Dis= new String[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter name of district:");
            Dis[i]=input.nextLine();
        }
        System.out.println("The name of Districts are:");
        for (int i=0; i<Dis.length; i++){
            System.out.println(Dis[i]);
        }
        
    }
}