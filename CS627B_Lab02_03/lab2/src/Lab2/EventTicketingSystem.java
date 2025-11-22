package Lab2;
//Student:Jieping Zhou 24250243;Xiandeng Fu 25250039;Liam Mc Cormack 25259012.
import java.util.Date;
// ==========================
// Demo Main Class
// ==========================
public class EventTicketingSystem {
      public static void main(String[] args) {
         // Create AccessPackage instances for each event type
        AccessPackage concertAccess = new AccessPackage("Front Row", "Backstage Access", "Live Stream");
        AccessPackage sportsAccess = new AccessPackage("VIP Box", "Free Snacks", "Highlights Package");
        AccessPackage confAccess = new AccessPackage("Section A", "Meet Speakers", "Recorded Sessions");
        // Create tickets
        Ticket t1 = new ConcertTicket("Rock Music", 122.00,new Date(), concertAccess, "Mark");
        Ticket t2 = new SportsTicket("Championship Finals", 82.00,new Date(), sportsAccess, "Trees");
        Ticket t3 = new ConferenceTicket("Tech Innovations 2025", 220.00,new Date(), confAccess, "Technology");
        // Create a ticket bundle and add tickets
        TicketBundle bundle = new TicketBundle();
        bundle.addTicket(t1);
        bundle.addTicket(t2);
        bundle.addTicket(t3);
        // Apply a 10% discount policy
        bundle.setDiscountPolicy(new PercentageDiscount(10)); // 10% off

        // Print out the summary of the entire bundle
        bundle.printBundleSummary();
    }




}
