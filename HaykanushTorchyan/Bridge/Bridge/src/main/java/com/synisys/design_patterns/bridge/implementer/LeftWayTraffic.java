package com.synisys.design_patterns.bridge.implementer;

/**
 * Created by haykanush.torchyan on 11/17/2014.
 */
public class LeftWayTraffic implements Traffic {

    protected LeftWayTraffic(){}

    @Override
    public void drive() {
        System.out.println(".. in accordance with LEFT way traffic law");
    }
}
