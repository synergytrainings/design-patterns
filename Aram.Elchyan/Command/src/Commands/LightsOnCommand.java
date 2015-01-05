package Commands;

import Receivers.Lights;

/**
 * Created by Aram on 12/22/2014.
 */
public class LightsOnCommand implements HomeCommand {
    private Lights receiver;

    public LightsOnCommand(Lights receiver) {
        this.receiver = receiver;
    }

    @Override
    public void ExecuteCommand() {
        receiver.TurnOn();
    }
}
