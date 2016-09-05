package Candle;

/**Class demonstrates use of Candle.Candle and Candle.ScentedCandle classes
 * Created by Draga on 5/09/2016.
 */
public class DemoCandles {
    public static void main(String[] args) {
        Candle myCandle = new Candle();
        myCandle.setColour("blue");
        myCandle.setHeight(4);

        ScentedCandle yourCandle = new ScentedCandle();
        yourCandle.setColour("golden");
        yourCandle.setHeight(3);
        yourCandle.setScent("happiness");

        myCandle.display();
        System.out.println("--------------------------------");
        yourCandle.display();

    }
}
