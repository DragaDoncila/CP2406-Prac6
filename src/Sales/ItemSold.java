package Sales;

/**Class for tracking Francis Pet Supply sales figures
 * 5/09/2016.
 */
public class ItemSold {
    int invoiceNumber;
    String description;
    double price;

    ItemSold(int invoiceNumber, String description, double price){
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.price = price;
    }

    public void display(){
        System.out.println(invoiceNumber);
        System.out.println("-----------------------------");
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
