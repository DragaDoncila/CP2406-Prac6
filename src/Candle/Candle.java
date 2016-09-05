package Candle;

/**Candle.Candle class for Mick's Wicks candles in various sizes
 * Created by Draga on 5/09/2016.
 */
public class Candle {
    protected String colour;
    protected double height;
    protected double price;

    Candle(){
        this.colour = "white";
        this.height = 1;
    }

    public void display(){
        System.out.println("Your " + colour + " candle is " + height + " inches tall.");
        System.out.println("It'll cost you $" + price);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = height * 2;
    }

    public double getPrice() {
        return price;
    }
}
