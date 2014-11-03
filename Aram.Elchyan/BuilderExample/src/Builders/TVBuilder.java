package Builders;
import Device.SmartDevice;
import DeviceComponents.Button;
import DeviceComponents.ExternalDevice;
import DeviceComponents.RemoteControl;
import DeviceComponents.Screen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aram on 11/3/2014.
 */
public class TVBuilder extends SmartDeviceBuilder {
    @Override
    public void BuildButtons() {
        List<Button> buttons = new ArrayList<Button>();
        Button btnOn = new Button();
        Button btnOff = new Button();
        buttons.add(btnOn);
        buttons.add(btnOff);
        this.device.setButtons(buttons);
    }

    @Override
    public void BuildExternalDevices() {
        RemoteControl remoteControl = new RemoteControl();
        List<ExternalDevice> externalDevices = new ArrayList<ExternalDevice>();
        externalDevices.add(remoteControl);
        this.device.setExternalDevices(externalDevices);
    }

    @Override
    public void BuildMemory() { }

    @Override
    public void BuildProcessor() { }

    @Override
    public void BuildScreen() {
        Screen screen = new Screen();
        this.device.setScreen(screen);
    }
}
