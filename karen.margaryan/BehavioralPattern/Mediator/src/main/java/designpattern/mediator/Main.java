package designpattern.mediator;

import designpattern.mediator.mediator.ApplicationMediator;
import designpattern.mediator.mediator.Message;
import designpattern.mediator.synchronizeddevices.IPad;
import designpattern.mediator.synchronizeddevices.IPhone;
import designpattern.mediator.synchronizeddevices.Macbook;
import designpattern.mediator.synchronizeddevices.SynchronizableDevice;

/**
 * Created by Sony on 3/31/2015.
 */
public class Main {
    public static void main(String [] args) {
        ApplicationMediator mediator = new ApplicationMediator();

        SynchronizableDevice ipad = new IPad(mediator);
        SynchronizableDevice iphone = new IPhone(mediator);
        SynchronizableDevice macbook = new Macbook(mediator);

        mediator.addUser(ipad);
        mediator.addUser(iphone);
        mediator.addUser(macbook);

        ipad.send(new Message("Jomolungma", "Hi there. Are you alive??"));
        System.out.println("--------------------------------------------");
        iphone.send(new Message("Yerevan", "No, we've just died. Any other questions?"));
    }
}
