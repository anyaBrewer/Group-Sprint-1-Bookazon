public class GoldSubsription implements Subscription {

    private final double DISCOUNT = .15;
    @Override
    public double getDiscount() {
        return 1 - DISCOUNT;
    }
}
