package Lab2;
//Student:Jieping Zhou 24250243;Xiandeng Fu 25250039;Liam Mc Cormack 25259012.
// ==========================
// Discount Implementations
// ==========================
public class PercentageDiscount implements DiscountPolicy{
    private double percent;
    public PercentageDiscount(double percent) {
        this.percent = percent;
    }
    // Apply a percentage-based discount (e.g., 10% off)
    @Override
    public double applyDiscount(double price) {
        return price * (1 - percent / 100);
    }
}
