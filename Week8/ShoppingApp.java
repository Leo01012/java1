package Week8;
public class ShoppingApp
{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Laptop", 280000, 2);
        cart.displayCart();
        
        cart.setQuantity(3);
        System.out.println("New Quantity: " + cart.getQuantity());
        System.out.println("New Total: " + cart.calculateTotal());
        double discountedTotal = cart.calculateDiscountedTotal(10);
        System.out.println("Discounted Total (10% off): " + discountedTotal);

    }
}