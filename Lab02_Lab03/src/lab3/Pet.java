//Student: Jieping Zhou 24250243; Jie Xu 24250367;
package lab3;
/**
 * Abstract base class for all pets in this example.
 *
 * <p>Demonstrates use of final, static and instance fields, an abstract
 * method for rent price calculation and a simple information printer.</p>
 */
abstract class Pet {
  /** Pet name  of the pet. */
  protected String name;
  protected int age;
  protected String breed;
  /** Categorical type for the pets (enum). */
  protected PetType type;
   /** Class-level counter tracking number of Pets instances created. */
  public static int petCount=0;
  /** Maximum age for the pet (constant per-instance). */
  public static final int MAX_AGE=30;//final
  /**
     * Construct a pet with a name, age, breed, and type .
     *
     * @param name.. human-readable name..
     * @param type  enumerated pet type
     */

public  Pet(String name,int age, String breed,PetType type){
  this.name=name;
  this.age=age;
  this.breed=breed;
  this.type=type;
  
  petCount++;
}
public String getName(){
  return this.name;
}
public int getAge(){
  return this.age;
}
public String getBreed(){
  return this.breed;
}
    /**
     * Return the per-instance maximum age constant.
     *
     * @return max age 
     */
    public final int getMAX_AGE() {
        return MAX_AGE;
    }
    /**
     * Return the total number of Pet instances created so far.
     *
     * @return count of created pets
     */
public static int getPetCount(){
  return petCount;
}
   /**
     * Making sound for this pet.
     *
     * <p>Concrete subclasses must provide an implementation.</p>
     *
     * @return diffenrent sounds per pet in currency units
     */
public abstract void makeSound();
   /**
     * Print pet information to standard output.
     *
     * <p>Note: method name is intentionally spelled "displyInfo" to match
     * existing code — avoid renaming unless you fix all call sites.</p>
     */
public final void displayInfo(){
   System.out.println("Name: " + type+"--"+name+"\nAge: "+ age + "\nBreed: "+ breed 
  +"\nMax Age: " + MAX_AGE);
}
}

