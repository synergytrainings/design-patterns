/**
 * Created by Aram on 10/30/2014.
 */
public class SupercarTires extends Tires {

    private double superTireFactor;

    public SupercarTires() {
        this.price = 5000;
        this.healthCoefficient = 0.004;
        this.health = 400;
        this.currentHealth = this.health;
        this.superTireFactor = 2;
    }

    @Override
    public void RuinTires() {
        this.currentHealth = this.currentHealth * (1 - this.healthCoefficient/this.superTireFactor);
    }
}
