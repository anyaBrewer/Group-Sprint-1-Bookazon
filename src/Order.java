import java.util.ArrayList;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private String userName;
    private String orderStatus;
    private Address billingAddress;
    private Address shippingAddress;
    private Cart cart;
    private double orderPrice;

    public Order(Cart cart, Subscription subscription) { 
        this.cart = cart;
        this.orderPrice =  Math.round(cart.calculatePrice() * subscription.getDiscount() * 100.0) / 100.0;
    }

    public void setShippingAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.shippingAddress = new Address(line1, line2, city, state, zip, country)
    }

    public void setBillingAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.billingAddress = new Address(line1, line2, city, state, zip, country)
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void setDateCreated(String date) {
        this.dateCreated = date;
    }

    public void setDateShipped(String date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + this.shippingAddress.getLine1() + ", " + this.shippingAddress.getLine2() + ", " + this.shippingAddress.getCity() + ", " + this.shippingAddress.getState() + ", " + this.shippingAddress.getZip() + ", " + this.shippingAddress.getCountry());
        System.out.println("Billing Address: " + this.billingAddress.getLine1() + ", " + this.billingAddress.getLine2() + ", " + this.billingAddress.getCity() + ", " + this.billingAddress.getState() + ", " + this.billingAddress.getZip() + ", " + this.billingAddress.getCountry());
        this.cart.viewCartDetails();
        System.out.println("Order Total: $" + cart.calculatePrice());
        System.out.println("Total After Discount: $" + orderPrice);

    }
  
}
