package Week9;

class Vehicle {
    int vehicleId;
    String brand;
    double basePrice;

    public Vehicle(int vehicleId, String brand, double basePrice) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.basePrice = basePrice;
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Base Price: $" + basePrice);
    }

    public double calculateTax() {
        return basePrice * 0.10;
    }
}