package Poem;

/**Class stores information about poems
 * Created by Draga on 5/09/2016.
 */
public class Poem {
    String title;
    int numLines;

    Poem(String title, int numLines){
        this.title = title;
        this.numLines = numLines;
    }

    public void display(){
        System.out.println(title + " is a poem with " + numLines + " lines.");
    }

    public String getTitle() {
        return title;
    }

    public int getNumLines() {
        return numLines;
    }
}
