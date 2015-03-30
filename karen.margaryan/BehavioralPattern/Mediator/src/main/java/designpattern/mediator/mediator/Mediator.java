package designpattern.mediator.mediator;

import designpattern.mediator.synchronizeddevices.SynchronizableDevice;

/**
 * Created by Sony on 3/31/2015.
 */
public interface Mediator {
    public void send(Message message, SynchronizableDevice sender);
}
