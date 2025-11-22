//(Name: ; StudentID: )
package lab1;//It is my package 
// Private fields
public class SmartDevice
{
    private String deviceName;
    private boolean status;// true = on, false = off
    private String location;
// Default Constructor
    public SmartDevice(){
        
    }
// General Constructor
    public SmartDevice(String deviceName, String location)
    {
        this.deviceName = deviceName;
        this.status = false;
        this.location = location;
    }
 // Getters and setters
    public String getDeviceName()
    {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }

    public boolean getStatus()
    {
        return this.status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public String getLocation()
    {
        return this.location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }
    public boolean isOn() {
        return status;
    }
 // Turn device on
    public void turnOn()
    {
        this.status = true;
        System.out.println(deviceName + " is now ON.");
    }
 // Turn device off
    public void turnOff()
    {
        this.status = false;
        System.out.println(deviceName + " is now OFF.");
    }
//Print all using toString
    @Override
    public String toString(){
        return  "Device: " + deviceName +
               "Location: " + location +
               "Status: " + (status ? "ON" : "OFF");
    }

}
