package Builders;
import Device.SmartDevice;
import DeviceComponents.Button;
import DeviceComponents.MicroSDCard;
import DeviceComponents.Processor;
import DeviceComponents.Screen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aram on 11/3/2014.
 */
public class PhoneBuilder extends SmartDeviceBuilder {
    @Override
    public void BuildButtons() {
        List<Button> buttons = new ArrayList<Button>();
        Button btn1 = new Button();
        buttons.add(btn1);
        Button btn2 = new Button();
        buttons.add(btn2);
        //........

        this.device.setButtons(buttons);
    }

    @Override
    public void BuildExternalDevices() { }

    @Override
    public void BuildMemory() {
        MicroSDCard card = new MicroSDCard();
        this.device.setMemory(card);
    }

    @Override
    public void BuildProcessor() {
        Processor processor = new Processor();
        this.device.setProcessor(processor);
    }

    @Override
    public void BuildScreen() {
        Screen screen = new Screen();
        this.device.setScreen(screen);
    }
}
