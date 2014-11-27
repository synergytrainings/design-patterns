package com.armen.mkrtchyan.facade.application;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 27, 2014</pre>
 */
public class MailService {

    public void send(String content, User user) {
        System.out.println("email with content '" + content + "' was sent to: " + user);
    }

}
