/**
 * Created by Aram on 10/30/2014.
 */
public abstract class Tires {
    public enum tiresState {
        New, Normal, Worn, Blown
    };

    protected double price;
    protected double healthCoefficient;
    protected double health;
    protected double currentHealth;
    protected tiresState state;


    public double getPrice() {
        return price;
    }

    public tiresState getState() {
        return state;
    }

    public abstract void RuinTires();

    public void calculateState() {
        if(this.health <= 0 ) {
            this.state = tiresState.Blown;
            return;
        }
        double damageCoef =  this.currentHealth / this.health;
        if(damageCoef < 1 && damageCoef > 0.8) {
            this.state = tiresState.New;
        }
        else {
            if(damageCoef > 0.4) {
                this.state = tiresState.Normal;
            }
            else {
                this.state = tiresState.Worn;
            }
        }
    }

    public Tires() {
        this.state = tiresState.New;
    }
}
