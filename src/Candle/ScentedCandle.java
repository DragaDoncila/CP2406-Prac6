package Candle;

/**Class to handle scented varieties of Mick's Wicks.
 * Created by Draga on 5/09/2016.
 */
public class ScentedCandle extends Candle {

    String scent;

    ScentedCandle(){
        super();
        scent = "vanilla";
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Your candle smells like " + scent);
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(double height){
        this.height = height;
        this.price = height * 3;
    }
}
