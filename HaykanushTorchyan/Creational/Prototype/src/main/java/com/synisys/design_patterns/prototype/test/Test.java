package com.synisys.design_patterns.factory.test;

import com.synisys.design_patterns.factory.Initializer;
import com.synisys.design_patterns.factory.MultilingualValuePrototype;

/**
 * Created by haykanush.torchyan on 11/7/2014.
 */
public class Test {

    public static void main(String[] args){
        //initializing messages map
        Initializer.init();
        MultilingualValuePrototype messages = MultilingualValuePrototype.getInstance();

        //As the messages in kb_am_Messages table are used each
        //multiple times within DE, we load them from cache instead of running a query
        //and creating a new Multilingual object every time, which is costy
        Integer messageID = 7756;
        System.out.println("The message with ID=" + messageID + " is " + messages.getMessage(messageID));
    }
}
