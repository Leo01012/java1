package Week9;

class Bike extends Vehicle {
    int engineCapacity;

    public Bike(int vehicleId, String brand, double basePrice, int engineCapacity){
        super(vehicleId, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    public double calculateFinalPrice() {
        double tax = calculateTax();
        return basePrice + tax;
    }

    public void displayBikeInfo() {
        displayVehicleInfo();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Final Price: $" + calculateFinalPrice());
    }
}