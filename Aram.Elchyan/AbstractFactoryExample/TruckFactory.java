/**
 * Created by Aram on 10/30/2014.
 */
public class TruckFactory extends CarFactory {
    @Override
    public Car CreateCar() {
        return new Truck();
    }

    @Override
    public Engine CreateEngine() {
        return new TruckEngine();
    }

    @Override
    public Tires CreateTires() {
        return new TruckTires();
    }
}
