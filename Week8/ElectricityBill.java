package Week8;
public class ElectricityBill
{
    private String consumerName;
    private int unitsConsumed;
    public ElectricityBill(String consumerName, int unitsConsumed) {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill() {
        double bill;
        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 5;
        } else {
            bill = (100 * 5) + ((unitsConsumed - 100) * 8);
        }
        return bill;
    }
    
    public String getConsumerName() {
        return consumerName;
    }

}