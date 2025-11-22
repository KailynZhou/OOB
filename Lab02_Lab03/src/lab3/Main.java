//Student: Jieping Zhou 24250243; Jie Xu 24250367;
package lab3;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
// Create a list of pets to demonstrate polymorphic behavior.
        ArrayList<Pet> pets = new ArrayList<>();
 // Add several vehicles to the list.
        Cat cat = new Cat("Summer", 19, "British shorthair");
        Dog dog = new Dog("Happy", 3, "Labrador");
        pets.add(dog);
        pets.add(cat);
        pets.add(new Bird("Black", 1, "Parrot"));
        pets.add(new Dog("Lily", 10, "German Shepherd"));
// Display general adoptation information from the Adoptable interface.
        Adoptable.globalRule();
        // use instanceof + casting
        // Print each pet's details and sound and breed using a utility method.
        System.out.println("\n--- Checking Pets by Type ---");
        PetUtils.printPetType(pets);

        // Print the total number of pets created (class-level counter).
        System.out.println("\n--- Summary ---");
        PetUtils.printSummary(pets);
    }
  
}
