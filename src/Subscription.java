public abstract class Subscription {
    private double discount;

    protected Subscription(double discount) {
        this.discount = discount;
    }

    public double getDiscount(){
        return discount;
    }
    
    public double applyDiscount(double price){
        // returns discounted price rounded to the cent
        return Math.round(price * discount * 100.0)/100.;
    }
    
}
