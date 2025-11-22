//(Name: ; StudentID: )
package lab1;
import java.util.ArrayList;
import java.util.List;
// List to store all devices
public class SmartHomeController
{
    private List <SmartDevice> devices = new ArrayList<>();

// Register a new device,it controls registrations of all devices including lights and thermostats
public void registerDevice(SmartDevice d)
{
    devices.add(d);
    System.out.println(d.getDeviceName()+" registered.");
}

// Toogle device by name (on -> off, off -> on),it controls toggling devices by name(on to off or off to on)
public void toggleDevice(String deviceName)
{
    for(SmartDevice d : devices) {
        if (d.getDeviceName().equalsIgnoreCase(deviceName)){
            if (d.isOn()){
                d.turnOff();
            }else{
                d.turnOn();
            }
            return;
        }
    }
    System.out.println("Device " + deviceName + " not found");
}

//List of all registered devices
public List<SmartDevice> listDevices()
{
    return devices;
}
// Simulate "Night Mode",Night Mode Method goes in Home Controller, which means users can turn lights off and make doors lock at night.
public void nightMode() {
    System.out.println("\n--- Activating Night Mode ---");
        for (SmartDevice d : devices) {
            if (d instanceof SmartLight) {
                d.turnOff();
            } else if (d instanceof SmartLock) {
                ((SmartLock) d).lock();
            }
        }
    }

}
