package DeviceComponents;

/**
 * Created by Aram on 11/2/2014.
 */
public class Memory {
    public int sizeInGb;

    public double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSizeInGb(int sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    public double getPrice() {
        return price;
    }

    public int getSizeInGb() {
        return sizeInGb;
    }
}
