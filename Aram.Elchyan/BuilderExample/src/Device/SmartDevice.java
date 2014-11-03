package Device;

import DeviceComponents.*;

import java.util.List;
/**
 * Created by Aram on 11/2/2014.
 */
public class SmartDevice {
    private List<Button> buttons;

    private Screen screen;

    private Processor processor;

    private List<ExternalDevice> externalDevices;

    private Memory memory;

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public void setExternalDevices(List<ExternalDevice> externalDevices) {
        this.externalDevices = externalDevices;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<ExternalDevice> getExternalDevices() {
        return externalDevices;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public Memory getMemory() {
        return memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Screen getScreen() {
        return screen;
    }
}
