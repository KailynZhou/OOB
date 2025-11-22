//Student:Jieping Zhou 24250243;Xiandeng Fu 25250039;Liam Mc Cormack 25259012.
package Lab2;
import java.util.Date;
// ==========================
// Subclasses for specific ticket types
// Each overrides generateSummary()
// ==========================
public class ConcertTicket extends Ticket {
  private String artist;
 //Constructor
  public ConcertTicket(String eventName, Double price, Date date,AccessPackage accessPackage, String artist){
    super(eventName, price,date,accessPackage);
    this.artist=artist;
  }
  @Override
  public String generateSummary(){
    return "[Concert Ticket] "+getEventName()+"by"+artist+"on"+getDate()+
    "\nPrice: $"+ getPrice()+"\nAccess"+accessPackage.toString();
  }
  
}
