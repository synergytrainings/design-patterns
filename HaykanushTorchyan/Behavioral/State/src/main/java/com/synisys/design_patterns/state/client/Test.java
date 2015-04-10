package com.synisys.design_patterns.state.client;

import com.synisys.design_patterns.state.Button;

/**
 * Created by haykanush.torchyan on 4/10/2015.
 */
public class Test {

    public static void main( String... args ) {
        Button button = new Button();
        button.press();
        button.press();
        button.press();
        button.press();

//        Output
//        turning ON
//        turning OFF
//        turning ON
//        turning OFF
    }
}
