package Lab2;
//Student:Jieping Zhou 24250243;Xiandeng Fu 25250039;Liam Mc Cormack 25259012.
// ==========================
// Discount Implementations
// ==========================
public class FixedAmountDiscount implements DiscountPolicy {
  private double amount;
  public FixedAmountDiscount(double amount){
    this.amount=amount;
  }
  // Apply a flat amount discount (e.g., $20 off)
  @Override
  public double applyDiscount(double price) {
        return Math.max(0, price - amount);// Prevent negative price
    }
}
