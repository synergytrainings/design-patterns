import Builders.PCBuilder;
import Builders.SmartDeviceBuilder;
import Device.SmartDevice;

public class Main {

    public static void main(String[] args) {
        SmartDeviceBuilder builder = new PCBuilder();

        Director director = new Director();
        director.setDeviceBuilder(builder);
        director.constructSmartDevice();

        SmartDevice device = director.getSmartDevice();
    }
}
