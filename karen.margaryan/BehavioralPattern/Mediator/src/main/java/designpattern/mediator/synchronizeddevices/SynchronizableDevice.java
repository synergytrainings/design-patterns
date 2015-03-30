package designpattern.mediator.synchronizeddevices;

import designpattern.mediator.mediator.Mediator;
import designpattern.mediator.mediator.Message;

/**
 * Created by Sony on 3/31/2015.
 */
public abstract class SynchronizableDevice {

    private Mediator mediator;

    public SynchronizableDevice(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(Message message) {
        mediator.send(message, this);
    }

    public abstract void receive(Message message, SynchronizableDevice from);
}
