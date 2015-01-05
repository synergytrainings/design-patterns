package Commands;

import Receivers.Door;

/**
 * Created by Aram on 12/22/2014.
 */
public class LockDoorCommand implements HomeCommand {
    private Door receiver;

    public LockDoorCommand(Door receiver) {
        this.receiver = receiver;
    }

    @Override
    public void ExecuteCommand() {
        receiver.Lock();
    }
}