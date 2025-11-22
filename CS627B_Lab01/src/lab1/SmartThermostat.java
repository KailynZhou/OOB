//(Name: ; StudentID: )
package lab1;
//Added subclasses:  SmartThermostat
public class SmartThermostat extends SmartDevice
{
    private double temperature;
//Default constructor
    public SmartThermostat()
    {
        super();
        temperature = 0;
    }
//General constructor
    public SmartThermostat(String deviceName,  String location, double temperature)
    {
        super(deviceName,location);
        this.temperature = temperature;
    }
//Getters and Setters
    public double getTemperature()
    {
        return this.temperature;
    }
//temperature is valid if users input 16 - 40
    public void setTemperatures(double temperature)
    {
        this.temperature = temperature;
        if(temperature>40 || temperature<16){
            System.out.println("the temperature is invalid and please input between 16 and 40 °C ");
        }
    }
//Print all using toString
    public String toString() {
        return super.toString() + " | Temperature: " + temperature + "°C";
    }

}

