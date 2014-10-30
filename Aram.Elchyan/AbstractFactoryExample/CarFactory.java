/**
 * Created by Aram on 10/30/2014.
 */
public abstract class CarFactory {
    public abstract Car CreateCar();

    public abstract Engine CreateEngine();

    public Brakes CreateBrakes() {
        return  new Brakes();
    }

    public abstract Tires CreateTires();
}
