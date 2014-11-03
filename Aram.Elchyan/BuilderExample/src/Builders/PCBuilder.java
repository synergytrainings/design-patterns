package Builders;
import Device.SmartDevice;
import DeviceComponents.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aram on 11/3/2014.
 */
public class PCBuilder extends SmartDeviceBuilder {
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
    public void BuildExternalDevices() {
        List<ExternalDevice> externalDivices = new ArrayList<ExternalDevice>();
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();
        JoyStick joystick = new JoyStick();
        externalDivices.add(keyboard);
        externalDivices.add(mouse);
        externalDivices.add(joystick);
        this.device.setExternalDevices(externalDivices);
    }

    @Override
    public void BuildMemory() {
        HardDrive hardDrive = new HardDrive();
        this.device.setMemory(hardDrive);
    }

    @Override
    public void BuildProcessor() {
        Processor proc = new Processor();
        this.device.setProcessor(proc);
    }

    @Override
    public void BuildScreen() {
        Screen screen = new Screen();
        this.device.setScreen(screen);
    }
}
