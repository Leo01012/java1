package Week9;

class Car extends Vehicle {
    int numberOfDoors;
    String fuelType;

    public Car(int vehicleId, String brand, double basePrice, int numberOfDoors, String fuelType){
        super(vehicleId, brand, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public double calculateFinalPrice() {
        double tax = calculateTax();
        double luxuryCharge = basePrice * 0.05;
        return basePrice + tax + luxuryCharge;
    }

    public void displayCarInfo() {
        displayVehicleInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Final Price: $" + calculateFinalPrice());
    }
}