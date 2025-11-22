
/**
 * Write a description of class RickshawFare here.
 *
 * @author (Leon)
 * @version (v1.1)
 */
import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter time (in minutes): ");
        double time = sc.nextDouble();
        System.out.print("Is the customer local? (yes/no): ");
        String localInput = sc.next();
        boolean isLocal = localInput.equalsIgnoreCase("yes");
        System.out.print("Is it night travel? (yes/no): ");
        String nightInput = sc.next();
        boolean isNight = nightInput.equalsIgnoreCase("yes");
        double fare = (distance * 20) + (time * 2);
        fare = isLocal ? fare * 0.9 : fare;
        fare = isNight ? fare * 1.2 : fare;
        System.out.println("Final Fare: Rs. " + Math.round(fare));
        sc.close();
    }
}