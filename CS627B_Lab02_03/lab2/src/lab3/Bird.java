//Student: Jieping Zhou 24250243; Jie Xu 24250367;
package lab3;
/**
 * Concrete pet representing a bird.
 *
 * <p>Implements Adopatable </p>
 */
public class Bird extends Pet implements Adoptable{
  public Bird(String name, int age, String breed){
    super(name, age, breed, PetType.BIRD);
  }
     /**
     * Print bird-specific information. Calls makeSound() then
     * prints sound.
     */
  @Override
  public void makeSound(){
    System.out.println("Chirp! Chirp!");
  }
        /**
     * Implementation of Adoptable.adopt for birds.
     */
  @Override
  public void adopt(){
    System.out.println(name+", the bird has been adopted!");
  }
  
}
