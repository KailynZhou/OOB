//Student:Jieping Zhou 24250243;Xiandeng Fu 25250039;Liam Mc Cormack 25259012.
package Lab2;
import java.util.Date;
// ==========================
// Base Ticket Class
// ==========================
 // Common ticket fields
public abstract class Ticket {
  private String eventName;
  private Double price;
  private Date date;
  protected AccessPackage accessPackage;
// Constructor
  public Ticket(){

  }
  public Ticket(String eventName, Double price, Date date, AccessPackage accessPackage){
    this.eventName=eventName;
    this.price=price;
    this.date=date;
    this.accessPackage=accessPackage;
  }
  //Getters and Setters
  public String getEventName(){
    return eventName;
  }
  public Double getPrice(){
    return price;
  }
  public Date getDate(){
    return date;
  }
  public void setEventName(String eventName){
    this.eventName=eventName;
  }
  public void setPrice(Double price){
    this.price=price;
  }
  public void setDate(Date date){
    this.date=date;
  }
  // Abstract method to be implemented differently by each ticket type
  public abstract String generateSummary();
}
