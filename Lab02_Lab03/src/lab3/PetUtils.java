//Student: Jieping Zhou 24250243; Jie Xu 24250367;
package lab3;
import java.util.ArrayList;
/**
 * Utility helpers for working with collections of Pet instances.
 */
public class PetUtils {
  public static void printSummary(ArrayList<Pet> pets) {
        System.out.println("------- PET SUMMARY -------");
        System.out.println("Total Pets Created: " + Pet.petCount);
        for (Pet p : pets) {
            p.displayInfo();
        }   
    }
      /**
     * Print details for each pet in the provided list.
     *
     * <p>This method demonstrates runtime type checks using instanceof and
     * then downcasts to call subclass-specific functionality.</p>
     *
     * @param pets list of pets to print
     */
  public static void printPetType(ArrayList<Pet>pets){
    for(Pet p : pets){
      p.displayInfo();
        if (p instanceof Dog) {
            Dog d = (Dog) p;
            System.out.println("This is a Dog, and it is a "+ d.breed);
            d.makeSound();
            d.adopt();
        }

        else if (p instanceof Cat) {
            Cat c = (Cat) p;
            System.out.println("This is a Cat, and it is a "+ c.breed);
            c.makeSound();
            c.adopt();
        }

        else if (p instanceof Bird) {
            Bird b = (Bird) p;
            System.out.println("This is a Bird., and it is a "+ b.breed);
            b.makeSound();
            b.adopt();
        }
        System.out.println();
    }
}
}
