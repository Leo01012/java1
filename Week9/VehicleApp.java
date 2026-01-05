package Week9;

public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car(101, "Toyota", 25000.0, 4, "Petrol");
        Bike bike = new Bike(202, "Yamaha", 1200.0, 150);

        System.out.println("=== Car Info ===");
        car.displayCarInfo();

        System.out.println("\n=== Bike Info ===");
        bike.displayBikeInfo();
    }
}