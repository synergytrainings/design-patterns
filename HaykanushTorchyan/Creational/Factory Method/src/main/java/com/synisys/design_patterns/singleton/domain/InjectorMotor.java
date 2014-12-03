package com.synisys.design_patterns.domain;

/**
 * Created by haykanush.torchyan on 11/7/2014.
 */
public class InjectorMotor extends Motor {

    {
        this.type = "Injector";
    }

    @Override
    public void run(){
        System.out.println("Injector motor run!");
    }

}
