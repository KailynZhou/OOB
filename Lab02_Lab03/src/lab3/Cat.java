//Student: Jieping Zhou 24250243; Jie Xu 24250367;
package lab3;

public class Cat extends Pet implements Adoptable {
/**
 * Concrete pet representing a cat.
 *
 * <p>Implements Adopatable </p>
 */
  public Cat(String name, int age, String breed){
    super(name, age, breed, PetType.CAT);
  }
    /**
     * Print cat-specific information. Calls makeSound() then
     * prints sound.
     */
  @Override
    public void makeSound() {
        System.out.println("Purr... Purr...");
    }
    /**
     * Implementation of Adoptable.adopt for cats.
     */
    @Override
    public void adopt() {
        System.out.println(name + ", the cat has been adopted!");
    }

}
