package Horse;

/**Class extends racehorse and adds a new field for # of races participated in by
 * the horse.
 * Created by Draga on 5/09/2016.
 */
public class RaceHorse extends Horse{
    int numRaces;

    RaceHorse(String name, String colour, int birthYear, int numRaces){
        super(name, colour, birthYear);
        this.numRaces = numRaces;
    }

    public int getNumRaces() {
        return numRaces;
    }

    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(name + " has competed in " + numRaces + " races.");

    }
}
