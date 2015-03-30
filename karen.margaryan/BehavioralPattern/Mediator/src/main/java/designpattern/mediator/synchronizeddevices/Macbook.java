package designpattern.mediator.synchronizeddevices;

import designpattern.mediator.mediator.Mediator;
import designpattern.mediator.mediator.Message;

/**
 * Created by Sony on 3/31/2015.
 */
public class Macbook extends SynchronizableDevice {

    public Macbook(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(Message message, SynchronizableDevice from) {
        System.out.println(getClass().getSimpleName() + " has been received a message" + message.toString());
    }
}
