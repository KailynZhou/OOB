package Lab2;
//Student:Jieping Zhou 24250243;Xiandeng Fu 25250039;Liam Mc Cormack 25259012.
// TicketBundle Class
// Groups multiple tickets together and applies discounts
import java.util.ArrayList;
import java.util.List;
// create a ArrayList
public class TicketBundle {
  private List<Ticket> tickets = new ArrayList<>();
    private DiscountPolicy discountPolicy;// Can be set dynamically
// Add a ticket to the bundle
    public void addTicket(Ticket ticket) { 
      tickets.add(ticket); 
    }
//Assign a discount strategy (can be fixed amount or percentage)
    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
 // Calculate total price (applying discount if available)
    public double getTotalPrice() {
        double total = 0;
        for (Ticket t : tickets) {
            total += t.getPrice();
        }
        return (discountPolicy != null) ? discountPolicy.applyDiscount(total) : total;
    }
 // Print summary of all tickets and the total price
    public void printBundleSummary() {
        System.out.println("===== Ticket Bundle Summary =====");
        for (Ticket t : tickets) {
            System.out.println(t.generateSummary());
            System.out.println("---------------------------------");
        }
        System.out.println("Total Price (after discount): $" + getTotalPrice());
    }
  
}
