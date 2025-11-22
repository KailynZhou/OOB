//(Name: ; StudentID: )
package lab1;

public class Main {
    public static void main(String []args){
        //1.users input and register light1, thermostat1, and back door.
        SmartHomeController controller = new SmartHomeController();
        SmartLight light1 = new SmartLight("bedroom Room Light", "bedroom Room",90,"RED");
        SmartThermostat thermostat1 = new SmartThermostat("Thermostat", "living room",22);
        SmartLock backDoorLock = new SmartLock("Back Door Lock", "exit");
        //2.print all devices
        controller.registerDevice(light1);
        controller.registerDevice(thermostat1);
        controller.registerDevice(backDoorLock);
        
        System.out.println("\n--- Devices ---");
        for (SmartDevice d : controller.listDevices()) {
            System.out.println(d);
        }

        // 3.Turn on light1
        light1.turnOn();

        //4.Adjust temperature to 100, but it is invalid , then adust temperature to 30
        thermostat1.setTemperatures(100);
        thermostat1.setTemperatures(30);

        // 5.Unlock back door lock
        backDoorLock.unlock();

        // 6.Simulate night mode
        controller.nightMode();
        //7.print all devices after night mode
        System.out.println("\n--- After Night Mode ---");
        for (SmartDevice d : controller.listDevices()) {
            System.out.println(d);
        }
    }
}
