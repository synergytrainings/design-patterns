package com.synisys.design_patterns.state;

/**
 * Created by haykanush.torchyan on 4/10/2015.
 */
public class ButtonStateOff extends ButtonState {

    private static ButtonStateOff instance = new ButtonStateOff();

    private ButtonStateOff(){}

    public static ButtonStateOff instance(){
        return instance;
    }

    public void press(Button button){
        button.setState(ButtonStateOn.instance());
        System.out.println( "   turning ON" );
    }
}