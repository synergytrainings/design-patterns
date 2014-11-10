package com.synisys.design_patterns.domain;

/**
 * Created by haykanush.torchyan on 11/7/2014.
 */
public class CommonMotor extends Motor{

    {
        this.type = "Common";
    }

    @Override
    public void run(){
        System.out.println("Common motor run!");
    }
}
