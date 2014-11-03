import Builders.SmartDeviceBuilder;
import Device.SmartDevice;

/**
 * Created by Aram on 11/3/2014.
 */
public class Director {
    private SmartDeviceBuilder builder;

    public void setDeviceBuilder(SmartDeviceBuilder builder) { this.builder = builder; }
    public SmartDevice getSmartDevice() { return builder.GetDevice(); }

    public void constructSmartDevice() {
        builder.BuildProcessor();
        builder.BuildMemory();
        builder.BuildScreen();
        builder.BuildExternalDevices();
        builder.BuildButtons();
    }
}
