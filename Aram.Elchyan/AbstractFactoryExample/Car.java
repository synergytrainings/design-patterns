/**
 * Created by Aram on 10/30/2014.
 */
public abstract class Car implements OnBrakeEventListener {

    protected Brakes brakes;

    protected Engine engine;

    protected Tires tires;

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tires getTires() {
        return  tires;
    }

    public Car() { }
}
