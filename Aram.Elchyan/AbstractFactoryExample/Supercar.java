/**
 * Created by Aram on 10/30/2014.
 */
public class Supercar extends Car {

    public Supercar() {

    }

    @Override
    public void Brake() {
        this.engine.DecreaseSpeedByBreak(this.brakes.getSpeedChangeCoefficientOnBrake());
        this.tires.RuinTires();
    }
}
