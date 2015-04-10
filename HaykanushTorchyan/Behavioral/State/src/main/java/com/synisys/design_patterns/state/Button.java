package com.synisys.design_patterns.state;

/**
 * Created by haykanush.torchyan on 4/10/2015.
 */
public class Button {

    private ButtonState state;

    public Button(){
        state = ButtonStateOff.instance();
    }

    protected void setState(ButtonState state){
        this.state = state;
    }

    public void press(){
        state.press(this);
    }
}
