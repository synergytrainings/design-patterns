/**
 * Created by Aram on 10/30/2014.
 */
public abstract class Engine {
    protected double speed;
    protected static int maxSpeed;
    protected static int pistonsCount;
    protected static int speedIncreaseOnAcceleration;

    public static int getPistonsCount() {
        return pistonsCount;
    }

    public static int getMaxSpeed() {
        return maxSpeed;
    }

    public void DecreaseSpeedByBreak(double breakCoefficient) {
        speed = speed * (1 - breakCoefficient);
        if(speed < 0) {
            speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public abstract void Start();

    public abstract void Accelerate();

    public abstract void Stop();

    public Engine() {
        this.speed = 0;
    }
}
