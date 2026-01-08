package Week10;

class BikeDelivery extends DeliveryPartner {
    public BikeDelivery(int partnerId, String name, double basePay) {
        super(partnerId, name, basePay);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 500;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 100);
    }
}