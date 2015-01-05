package Commands;

import Receivers.Curtains;

/**
 * Created by Aram on 12/22/2014.
 */
public class CloseCurtainsCommand implements HomeCommand {
    private Curtains receiver;

    public CloseCurtainsCommand(Curtains receiver) {
        this.receiver = receiver;
    }

    @Override
    public void ExecuteCommand() {
        receiver.Open();
    }
}
