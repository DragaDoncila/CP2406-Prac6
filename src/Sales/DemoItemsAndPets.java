package Sales;

/**Demonstrates use of methods in Sales.ItemSold and Sales.PetSold classes
 * Created by Draga on 5/09/2016.
 */
public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold washingMachine = new ItemSold(5669452, "7L Frontloader", 680);
        PetSold spot = new PetSold(5669453, "Dalmatian puppy", 1000,
                true, true, false);

        washingMachine.display();
        spot.display();

        spot.setHousebroken(true);
        spot.display();

        washingMachine.setDescription("7L Frontloader, slightly used");
        System.out.println(washingMachine.getDescription());
    }
}
