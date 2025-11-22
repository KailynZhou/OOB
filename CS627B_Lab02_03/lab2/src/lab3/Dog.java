//Student: Jieping Zhou 24250243; Jie Xu 24250367;
package lab3;
/**
 * Concrete pet representing a dog.
 *
 * <p>Implements Adopatable </p>
 */
public class Dog extends Pet implements Adoptable{
  public Dog(String name, int age, String breed){
    super(name,age,breed,PetType.DOG);
  }
    /**
     * Print dog-specific information. Calls makeSound() then
     * prints sound.
     */
  @Override
  public void makeSound(){
    System.out.println("Woof!woof!");
  }
    /**
     * Implementation of Adoptable.adopt for dogs.
     */
  @Override
  public void adopt(){
    System.out.println(name + ", the dog has been adopted!");
  }

}
