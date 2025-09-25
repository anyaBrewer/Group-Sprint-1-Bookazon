public class SilverSubscription implements Subscription {

    private final double DISCOUNT = .05;
    @Override
    public double getDiscount() {
        return 1 - DISCOUNT;
    }
}
