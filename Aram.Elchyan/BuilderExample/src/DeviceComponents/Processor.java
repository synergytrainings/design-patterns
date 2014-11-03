package DeviceComponents;

/**
 * Created by Aram on 11/2/2014.
 */
public class Processor {
    private int numberOfCores;

    private Double price;

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}
