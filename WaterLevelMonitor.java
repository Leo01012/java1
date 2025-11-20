
/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[] args) {
        int waterLevel = 1500;
        System.out.println("Current Water Level: " + waterLevel + "L");
        String status = (waterLevel >= 3456) 
                        ? "WARNING: Water level has reached 1000L or more!" 
                        : "Status: Normal";
        System.out.println(status);
    }

}