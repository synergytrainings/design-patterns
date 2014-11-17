package com.synisys.design_patterns.bridge;

import com.synisys.design_patterns.bridge.abstraction.Bus;
import com.synisys.design_patterns.bridge.abstraction.FamilyCar;
import com.synisys.design_patterns.bridge.utils.TrafficDireciton;

/**
 * Created by haykanush.torchyan on 11/17/2014.
 */
public class Test {

    @org.junit.Test
    public static void main(String[] args){
        FamilyCar familyCar = new FamilyCar(TrafficDireciton.LEFT_WAY);
        Bus bus = new Bus(TrafficDireciton.LEFT_WAY);

        //driving the bus and the family car in a right way traffic
        familyCar.move();
        bus.move();

        System.out.println("\n Traveling to a country with RIGHT WAY traffic");
        //changing the implementer
        familyCar.changeTrafficDirectionTo(TrafficDireciton.RIGHT_WAY);
        familyCar.move();

    }
}
