//(Name: ; StudentID: )
package lab1;
//Added subclasses: SmartThermostat
    public class SmartLock extends SmartDevice {
        private boolean locked;
//Default constructor
    public SmartLock(){
        super();
}
//General constructor
//locked = true, unlocked = false)
    public SmartLock(String deviceName, String location) {
        super(deviceName, location);
        this.locked = false;
    }
//get the door lock status(locked or unlocked)
    public boolean isLocked() {
        return locked;
    }
//lock the door
    public void lock() {
        locked = true;
        System.out.println(getDeviceName() + " is now LOCKED.");
    }
//unlock the door
    public void unlock() {
        locked = false;
        System.out.println(getDeviceName() + " is now UNLOCKED.");
    }
//Print all using toString
    @Override
    public String toString() {
        return super.toString() + " | Lock Status: " + (locked ? "LOCKED" : "UNLOCKED");
    }
  
}
