package com.synisys.design_patterns.bridge.implementer;

/**
 * Created by haykanush.torchyan on 11/17/2014.
 */
public class RightWayTraffic implements Traffic {

    protected RightWayTraffic(){}

    @Override
    public void drive() {
        System.out.println(".. in accordance with RIGHT way traffic law");
    }
}
