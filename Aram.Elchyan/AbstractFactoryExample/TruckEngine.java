/**
 * Created by Aram on 10/30/2014.
 */
public class TruckEngine extends Engine {

    private double soeedDecreaseAfterAcceleration = 10;
    protected static int speedIncreaseOnAcceleration = 50;

    public TruckEngine() {
        this.pistonsCount = 5;
        this.maxSpeed = 150;
    }

    @Override
    public void Start() {
        this.speed = 2;
    }

    @Override
    public void Accelerate() {
        speed += speedIncreaseOnAcceleration - speedIncreaseOnAcceleration;
    }

    @Override
    public void Stop() {
        this.speed -= 2;
        if(this.speed < 0) {
            this.speed = 0;
        }
    }
}
