package Week10;

class NormalOrder extends Order {
    public NormalOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount();
    }

    public double calculateFinalAmount(double discountAmount) {
        return super.calculateFinalAmount() - discountAmount;
    }
}