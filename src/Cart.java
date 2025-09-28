import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Media media, int quantity) {
        items.add(new CartItem(media, quantity));
    }

    public void removeItem(Media media) {

        for (CartItem item : items) {
            if (item.equals(media)) {
                items.remove(item);
                break;
            }
        }
    }

    public void updateQuantity(Media media, int quantity) {
        for (CartItem cartItem : items) {
            if (cartItem.equals(media)) {
                cartItem.setQuantity(quantity);
                break;
            }
        }
    }

    public void viewCartDetails() {
        System.out.println("Cart Details:");
        for (CartItem item : items) {
            System.out.println(item.getName() + " - Quantity: " + item.getQuantity());
        }
        System.out.println("\n");
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public double calculatePrice() {
        double totalPrice = 0.0;

        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
    }

    public double applyDiscount(double price, Subscription subscription) {
        return price * subscription.getDiscount();
    }
}
