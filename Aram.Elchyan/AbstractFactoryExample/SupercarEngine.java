/**
 * Created by Aram on 10/30/2014.
 */
public class SupercarEngine extends Engine {

    private double supercarEngineBoost = 5;
    protected static int speedIncreaseOnAcceleration = 50;

    public SupercarEngine() {
        this.pistonsCount = 9;
        this.maxSpeed = 320;
    }

    @Override
    public void Start() {
        this.speed += 100;
    }

    @Override
    public void Accelerate() {
        speed += speedIncreaseOnAcceleration + supercarEngineBoost;
        if(speed < maxSpeed) {
            speed = maxSpeed;
        }
    }

    @Override
    public void Stop() {
        this.speed -= 20;
        if(speed < 0) {
            speed = 0;
        }
    }
}
