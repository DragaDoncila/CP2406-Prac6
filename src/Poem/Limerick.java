package Poem;

/**Class handles Poem.Limerick poems with 5 lines
 * Created by Draga on 5/09/2016.
 */
public class Limerick extends Poem{

    Limerick(String title){
        super(title, 5);
    }

    @Override
    public void display(){
        System.out.println("Your poem is a Poem.Limerick.");
        super.display();
    }
}
