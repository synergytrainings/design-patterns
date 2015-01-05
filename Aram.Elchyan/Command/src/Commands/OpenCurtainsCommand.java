package Commands;

import Receivers.Curtains;

/**
 * Created by Aram on 12/22/2014.
 */
public class OpenCurtainsCommand implements HomeCommand {
    private Curtains receiver;

    public OpenCurtainsCommand(Curtains receiver) {
        this.receiver = receiver;
    }

    @Override
    public void ExecuteCommand() {
        receiver.Open();
    }
}
