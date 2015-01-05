package Commands;

import Receivers.Door;

/**
 * Created by Aram on 12/22/2014.
 */
public class UnLockDoorCommand implements HomeCommand {
    private Door receiver;

    public UnLockDoorCommand(Door receiver) {
        this.receiver = receiver;
    }

    @Override
    public void ExecuteCommand() {
        receiver.Unlock();
    }
}