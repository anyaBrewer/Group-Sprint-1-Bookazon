public class PlatinumSubscription implements Subscription {

    private final double DISCOUNT = .1;
    @Override
    public double getDiscount() {
        return 1 - DISCOUNT;
    }
}
