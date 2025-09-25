public class SilverSubsription implements Subscription {

    private final double DISCOUNT = .05;
    @Override
    public double getDiscount() {
        return 1 - DISCOUNT;
    }
}
