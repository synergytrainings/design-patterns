/**
 * Created by Aram on 10/30/2014.
 */
public class Truck extends Car {
    private static double speedHardChangeCoefficient = 0.8;

    public Truck() {

    }

    @Override
    public void Brake() {
        this.engine.DecreaseSpeedByBreak(this.brakes.getSpeedChangeCoefficientOnBrake() * speedHardChangeCoefficient);
        this.tires.RuinTires();
    }
}
