//Student: Jieping Zhou 24250243; Jie Xu 24250367;
package lab3;
/**
 * Interface for items that can be adopted.
 *
 * <p>Provides a default method for showing adoptable terms and a static
 * helper for displaying general information shared by all adoptables.</p>
 */
public interface Adoptable {
  
     /**
     * adoptable results for the adoptable item.
     */
  void adopt();
    /**
     * Show adoptable terms to the console.
     *
     * <p>Default method so implementors may optionally override.</p>
     */
  default void adoptionDocument(){
    System.out.println("You need to provide standard adoption documents");
  }

    /**
     * Display general rental information (static helper).
     */
  static void globalRule(){
    System.out.println("Rule: All adopters must be at least 18 years old and they must provide pets with food and a living environment.");
  }

}
