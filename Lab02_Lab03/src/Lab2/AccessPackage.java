package Lab2;
//Student:Jieping Zhou 24250243;Xiandeng Fu 25250039;Liam Mc Cormack 25259012.

public class AccessPackage {
  private String seatingInfo;
  private String vipPerks;
  private String digitalAccess;

  // Constructor
  public AccessPackage(String seatingInfo, String vipPerks, String digitalAccess){
    this.seatingInfo=seatingInfo;
    this.vipPerks=vipPerks;
    this.digitalAccess=digitalAccess;
  }
  //getters
  public String getSeat(){
    return seatingInfo;
  }
  public String getVipPerks(){
    return vipPerks;
  }
  public String getDigitalAccess(){
    return digitalAccess;
  }
  // Readable string format for display
  @Override
  public String toString(){
    return "Seating: " + seatingInfo + ", VIP: " + vipPerks + ", Digital Access: " + digitalAccess;
  }
}

