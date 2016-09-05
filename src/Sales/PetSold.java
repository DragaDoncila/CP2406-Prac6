package Sales;

/**Class handles pets sold through Francis Pet Supply
 * Created by Draga on 5/09/2016.
 */
public class PetSold extends ItemSold{

    boolean isVaccinated;
    boolean isNeutered;
    boolean isHousebroken;

    PetSold(int invoiceNumber, String description, double price,
            boolean isVaccinated, boolean isNeutered, boolean isHousebroken){
        super(invoiceNumber, description, price);
        this.isVaccinated = isVaccinated;
        this.isNeutered = isNeutered;
        this.isHousebroken = isHousebroken;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Vaccinated: " + isVaccinated);
        System.out.println("Neutered: " + isNeutered);
        System.out.println("Housebroken: " + isHousebroken);
        System.out.println();
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }

    public boolean isHousebroken() {
        return isHousebroken;
    }

    public void setHousebroken(boolean housebroken) {
        isHousebroken = housebroken;
    }
}
