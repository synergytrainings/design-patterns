package DeviceComponents;

/**
 * Created by Aram on 11/3/2014.
 */
public class RemoteControl extends ExternalDevice {
    private double maxDistance;

    private int batteriesCount;

    public void setBatteriesCount(int batteriesCount) {
        this.batteriesCount = batteriesCount;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public int getBatteriesCount() {
        return batteriesCount;
    }
}
