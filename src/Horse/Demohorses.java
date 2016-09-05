package Horse;

/** Class demonstrates use of both Horse.Horse type objects
 * Created by Draga on 5/09/2016.
 */
public class Demohorses {
    public static void main(String[] args) {
        Horse playHorse = new Horse("Black Beauty", "black", 1969);
        RaceHorse workHorse = new RaceHorse("Seabiscuit", "blue", 1971, 10);

        System.out.println(playHorse.getName());
        System.out.println(playHorse.getColour());
        System.out.println(playHorse.getBirthYear());

        playHorse.setName("Blacker Beautifuler");
        playHorse.setColour("dark black");
        playHorse.setBirthYear(1980);
        playHorse.display();
        System.out.println("--------------------------------------------------");

        System.out.println(workHorse.getName());
        System.out.println(workHorse.getColour());
        System.out.println(workHorse.getBirthYear());

        workHorse.setName("Phar Lap");
        workHorse.setColour("mottled");
        workHorse.setBirthYear(1981);
        workHorse.display();
    }
}
