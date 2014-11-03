package DeviceComponents;

/**
 * Created by Aram on 11/3/2014.
 */
public class JoyStick extends ExternalDevice {
    private double price;

    private double company;

    public void setCompany(double company) {
        this.company = company;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }
}
