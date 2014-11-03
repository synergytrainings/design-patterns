package Builders;
import Device.SmartDevice;

/**
 * Created by Aram on 11/2/2014.
 */
public abstract class SmartDeviceBuilder {
    protected SmartDevice device;

    public SmartDeviceBuilder() {
        device = new SmartDevice();
    }

    public abstract void BuildButtons();

    public abstract void BuildExternalDevices();

    public abstract void BuildMemory();

    public abstract void BuildProcessor();

    public abstract void BuildScreen();

    public SmartDevice GetDevice() {
        return device;
    };
}
