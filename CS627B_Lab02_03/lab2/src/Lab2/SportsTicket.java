//Student:Jieping Zhou 24250243;Xiandeng Fu 25250039;Liam Mc Cormack 25259012.
package Lab2;
import java.util.Date;
// ==========================
// Subclasses for specific ticket types
// Each overrides generateSummary()
// ==========================
public class SportsTicket extends Ticket {
  private String teamNames;
//Constructor
public SportsTicket(String eventName, Double price, Date date,AccessPackage accessPackage, String teamNames){
  super(eventName, price,date, accessPackage );
  this.teamNames=teamNames;
}

@Override
public String generateSummary(){
return "[Sports Ticket] " + teamNames+ "at"+getEventName() + " on " + getDate()
                + "\nPrice: $" + getPrice()
                + "\nAccess: " + accessPackage.toString();
}
}
