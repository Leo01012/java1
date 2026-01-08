package Week10;public class OrderApp {
    public static void main(String[] args) {
        NormalOrder nOrder = new NormalOrder(101, "Sita", 5000);
        PremiumOrder pOrder = new PremiumOrder(102, "Ram", 8000);

        System.out.println("=== Normal Order Invoice ===");
        System.out.println(nOrder);

        System.out.println("\n=== Premium Order Invoice ===");
        System.out.println(pOrder);
        System.out.println("\nNormal Order with Discount: " + nOrder.calculateFinalAmount(500));
        System.out.println("Premium Order with Discount: " + pOrder.calculateFinalAmount(1000));
    }
}