
/**
 * Write a description of class try1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class try1
{
    

    public static void main(String[] args) {
      
        String[] medicineNames = {"Aspirin", "Naproxen", "Cephalexin", "Paracetamol", "Phenylephrine"};
        double[] prices = {4.0, 8.5, 5.0, 7.5, 8.0};
        int[] stock = {125, 70, 90, 75, 55};
        String[] prescriptionRequired = {"Not Required","Required","Not Required", "Required", "Not Required"};

        System.out.println("--------------------------------------------------------------");
        System.out.println("               Aushadi Pasal (Pharmacy)            ");
        System.out.println("--------------------------------------------------------------");
        System.out.printf( "Medicine" + "   Price" + "    Quantity" + "   Prescription\n");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < medicineNames.length; i++) {
            System.out.printf(medicineNames[i] + "      " + prices[i] + "       " + stock[i] + "        " + prescriptionRequired[i] + "\n");
        }
    }

}