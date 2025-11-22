//(Name: ; StudentID: )
package lab1;
//Added subclasses: SmartLight
//additional fields like brightness, color
public class SmartLight extends SmartDevice
{
    private int brightness;// 0-100%
    private String colour;
//Default constructor
    public SmartLight()
    {
        super();
        brightness = 0;
        colour = "";
    }
//General constructor
    public SmartLight(String deviceName, String location, int brightness, String colour)
    {
        super(deviceName, location);
        this.brightness = brightness;
        this.colour = colour;
    }
//Getters and Setters
    public int getBrightness()
    {
        return this.brightness;
    }

    public void setBrightness(int brightness)
    {
        this.brightness = brightness;
    }

    public String getColour()
    {
        return this.colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }
//Print all using toString
    @Override
    public String toString() {
        return super.toString() + " | Brightness: " + brightness + "% | Coulour: " + colour;
    }

}
