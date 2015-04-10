package com.synisys.design_patterns.state;

/**
 * Created by haykanush.torchyan on 4/10/2015.
 */
public class ButtonStateOn extends ButtonState {

    private static ButtonStateOn instance = new ButtonStateOn();

    private ButtonStateOn(){}

    public static ButtonStateOn instance(){
        return instance;
    }

    public void press( Button b ){
        b.setState(ButtonStateOff.instance());
        System.out.println( "   turning OFF" );
    }
}