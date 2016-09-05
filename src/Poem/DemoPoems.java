package Poem;

/**Class demonstrates use of different poem objects.
 * Created by Draga on 5/09/2016.
 */
public class DemoPoems {
    final static String SEP = "---------------------------------------------";

    public static void main(String[] args) {
        Poem normalPoem = new Poem("The Raven", 108);
        Couplet smallPoem = new Couplet("Short Poem.Poem");
        Limerick irishPoem = new Limerick("There Once was a Man from Nantucket");
        Haiku japanesePoem = new Haiku("Overripe sushi");

        normalPoem.display();
        System.out.println(SEP);
        smallPoem.display();
        System.out.println(SEP);
        irishPoem.display();
        System.out.println(SEP);
        japanesePoem.display();


    }
}
