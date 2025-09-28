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

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
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
        System.out.println("Shipping Address: " + this.shippingAddress.getAddress());
        System.out.println("Billing Address: " + this.billingAddress.getAddress());
        this.cart.viewCartDetails();
        System.out.println("Order Total: $" + cart.calculatePrice());
        System.out.println("Total After Discount: $" + orderPrice);

    }
  
}
