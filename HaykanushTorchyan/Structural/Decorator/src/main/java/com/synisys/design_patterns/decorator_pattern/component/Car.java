package com.synisys.design_patterns.decorator_pattern.component;

/**
 * Created by haykanush.torchyan on 11/24/2014.
 */
public class Car extends CarTunning {

    private Integer motorVolume;
    private Integer strength;
    private String type;

    @Override
    public void tune(){
        setSpares(new StringBuilder("Tune the wheels"));
    }

    public void drive(){
        System.out.println("Driving the car...");
    }

    public void stop(){
        System.out.println("Stopping the car...");
    }
}
