package Week10;

public class DeliveryApp {
    public static void main(String[] args) {
        BikeDelivery b1 = new BikeDelivery(101, "Ram", 5000);
        CarDelivery c1 = new CarDelivery(102, "Shyam", 7000);

        System.out.println(b1);
        System.out.println("Bike Delivery Payment: " + b1.calculatePayment());
        System.out.println("Bike Delivery Payment with extra orders: " + b1.calculatePayment(3));

        System.out.println(c1);
        System.out.println("Car Delivery Payment: " + c1.calculatePayment());
        System.out.println("Car Delivery Payment with extra orders: " + c1.calculatePayment(2));
    }
}
