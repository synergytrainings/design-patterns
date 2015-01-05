package Commands;

import Receivers.Condition;

/**
 * Created by Aram on 12/22/2014.
 */
public class DecreaseTemperatureCommand implements HomeCommand {
    private Condition receiver;

    public DecreaseTemperatureCommand(Condition receiver) {
        this.receiver = receiver;
    }

    @Override
    public void ExecuteCommand() {
        receiver.SetTemperature(receiver.GetTemperature() - 1);
    }
}
