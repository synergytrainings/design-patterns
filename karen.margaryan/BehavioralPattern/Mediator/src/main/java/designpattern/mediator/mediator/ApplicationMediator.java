package designpattern.mediator.mediator;

import designpattern.mediator.synchronizeddevices.SynchronizableDevice;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sony on 3/31/2015.
 */
public class ApplicationMediator implements Mediator {

    List<SynchronizableDevice> users;

    public ApplicationMediator() {
        users = new LinkedList<SynchronizableDevice>();
    }

    public void addUser(SynchronizableDevice user) {
        users.add(user);
    }

    public void send(Message message, SynchronizableDevice sender) {
        for (SynchronizableDevice user : users) {
            // There is no need to implement "equals()" and use it, as the main
            // purpose of this example is concentrated on implementing design pattern example
            if (user != sender) {
                user.receive(message, sender);
            }
        }
    }
}
