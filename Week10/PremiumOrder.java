package Week10;

class PremiumOrder extends Order {
    public PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount() * 0.9;
    }

    public double calculateFinalAmount(double discountAmount) {
        return super.calculateFinalAmount() - discountAmount;
    }
}
