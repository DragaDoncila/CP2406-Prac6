package Poem;

/**Poem.Couplet extends Poem.Poem with only 2 lines.
 * Created by Draga on 5/09/2016.
 */
public class Couplet extends Poem {

    Couplet(String title){
        super(title, 2);
    }

    @Override
    public void display(){
        System.out.println("Your poem is a Poem.Couplet.");
        super.display();
    }

}
