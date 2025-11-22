//Student:Jieping Zhou 24250243;Xiandeng Fu 25250039;Liam Mc Cormack 25259012.
package Lab2;
import java.util.Date;
// ==========================
// Subclasses for specific ticket types
// Each overrides generateSummary()
// ==========================
public class ConferenceTicket extends Ticket {
  private String topic;
//Constructor
  public ConferenceTicket(String eventName, Double price, Date date,AccessPackage accessPackage, String topic){
    super(eventName, price,date ,accessPackage);
    this.topic=topic;
  }
 @Override
public String generateSummary(){
return "[Conference Ticket] "+getEventName() + " on " + getDate()
                + "\nTopic" + topic
                + "\nPrice: $" + getPrice()
                + "\nAccess: " + accessPackage.toString();
}
}


