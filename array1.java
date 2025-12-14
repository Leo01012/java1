
/**
 * Write a description of class array1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array1
{
    public static void main(String[] args){
        int[] age;
        age = new int[5];
        
        System.out.println(age.length);
        
        age[0]=10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        
        int firstElement=age[0];
        
        System.out.println(firstElement);
        
        int lastElement=age[4];
        
        System.out.println(lastElement);
        
        int[] agr={10,20,30,40,50};
        
        for(int i=0; i< agr.length; i++)
        {
            System.out.println(agr[i]);
        }
        int sum=0;
        for(int i=0; i< agr.length; i++)
        {
            sum=sum+agr[i];
        }
        System.out.println(sum);
    }
}