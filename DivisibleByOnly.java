
/**
 * Write a description of class DivisibleByOnly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivisibleByOnly
{
    
    public static void main(String[] args){
        int num=2;
        if (num % 3==0){
            if (num%5==0){
                System.out.println("It is divisible by both 3 and 5");
            }
            else{
                System.out.println("It is divisible by only 3");
            }
        }
        else if(num%5==0){
            System.out.println("It is divisible by only 5");
        }
        else{
            System.out.println("It is not divisible by both");
        }
    }

}