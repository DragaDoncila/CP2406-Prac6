package Poem;

/**Class handles Poem.Haiku poems.
 * Created by Draga on 5/09/2016.
 */
public class Haiku extends Poem {

    Haiku(String title){
        super(title, 3);
    }

    @Override
    public void display(){
        System.out.println("Your poem is a Poem.Haiku.");
        super.display();
    }
}
