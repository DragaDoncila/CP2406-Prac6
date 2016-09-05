package Horse;

import com.sun.org.apache.xpath.internal.SourceTree;

/**Class handles horse objects with fields for name, colour and birth year.
 * Created by Draga on 5/09/2016.
 */
public class Horse {
    String name;
    String colour;
    int birthYear;

    Horse(String name, String colour, int birthYear){
        this.name = name;
        this.colour = colour;
        this.birthYear = birthYear;
    }

    public void display(){
        System.out.println("Your horse's name is: " + name);
        System.out.println("Your horse is " + colour + " and was born in " + birthYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
