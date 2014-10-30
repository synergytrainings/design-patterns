import java.util.*;

/**
 * Created by Aram on 10/30/2014.
 */
public class Brakes {
    private List<OnBrakeEventListener>  onBrakeListeners;
    protected int speedChangeCoefficientOnBrake;

    public void setSpeedChangeCoefficientOnBrake(int speedChangeCoefficientOnBrake) {
        this.speedChangeCoefficientOnBrake = speedChangeCoefficientOnBrake;
    }

    public int getSpeedChangeCoefficientOnBrake() {
        return speedChangeCoefficientOnBrake;
    }

    public void addOnBrakeListener(OnBrakeEventListener listener) {
        this.onBrakeListeners.add(listener);
    }

    public Brakes() {
        onBrakeListeners = new ArrayList<OnBrakeEventListener>();
    }

    public void Brake() {
        for(OnBrakeEventListener listener : onBrakeListeners) {
            listener.Brake();
        }
    };
}

interface OnBrakeEventListener {
    public void Brake();
}
