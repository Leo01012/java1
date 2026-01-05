package Week8;
public class ElectricityBillTest
{
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill("Leo", 150);
        System.out.println("Consumer: " + bill.getConsumerName());
        System.out.println("Units Consumed: " + bill.getUnitsConsumed());
        System.out.println("Total Bill: " + bill.calculateBill());
    }
}