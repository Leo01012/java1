
/**
 * Write a description of class StudentArrya here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StudentArray
{
    public static void main(String[] args){
        
        String[] names={"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};
        System.out.println("The names of students:");
        for (int i=0; i<=4; i++){
            System.out.println(names[i]);
        }
        
        System.out.println("The name at index 2 is " + names[2]);
        
        names[4]="Leo";
        System.out.println("The new name of index 4 is " + names[4]);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Write the index where to change the name(from 0-4):");
        int index= input.nextInt();
        System.out.println("Write the name to change on that index");
        input.nextLine();
        String value=input.nextLine();

        names[index]=value;
        
        System.out.println("The new names of students are:");
        for (int i=0; i<=4; i++){
            System.out.println(names[i]);
        }
    }
}