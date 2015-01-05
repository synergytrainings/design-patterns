package Receivers;

/**
 * Created by Aram on 12/22/2014.
 */
public class Condition {
    private static final int minTemperature = 5;
    private static final int maxTemperature = 40;

    private int temperature;

    public void SetTemperature(int temperature) {
        if(temperature > minTemperature && temperature < maxTemperature)
            this.temperature = temperature;
    }

    public int GetTemperature() {
        return temperature;
    }
}
