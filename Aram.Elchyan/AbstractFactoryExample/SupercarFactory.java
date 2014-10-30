/**
 * Created by Aram on 10/30/2014.
 */
public class SupercarFactory extends CarFactory {
    @Override
    public Car CreateCar() {
        return new Supercar();
    }

    @Override
    public Engine CreateEngine() {
        return new SupercarEngine();
    }

    @Override
    public Tires CreateTires() {
        return new SupercarTires();
    }
}
