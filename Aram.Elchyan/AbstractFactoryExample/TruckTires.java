/**
 * Created by Aram on 10/30/2014.
 */
public class TruckTires extends Tires {

    public TruckTires() {
        this.price = 2500;
        this.healthCoefficient = 0.15;
        this.health = 400;
        this.currentHealth = this.health;
    }

    @Override
    public void RuinTires() {
        this.currentHealth = this.currentHealth * (1 - this.healthCoefficient);
    }
}
