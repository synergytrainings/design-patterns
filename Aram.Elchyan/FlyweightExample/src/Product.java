/**
 * Created by aram.elchyan on 12/1/2014.
 */
public class Product {
    private String id;

    private String title;

    private String description;

    private double price;

    private Image img;

    public Product(String title, String description, double prioce, Image img) {
        this.title = title;
        this.description = description;
        this.price = prioce;
        this.img = img;
    }

    public String GetId() {
        return id;
    }

    public double GetPrice() {
        return price;
    }

    public String GetDescription() {
        return description;
    }

    public String GetTitle() {
        return title;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}
