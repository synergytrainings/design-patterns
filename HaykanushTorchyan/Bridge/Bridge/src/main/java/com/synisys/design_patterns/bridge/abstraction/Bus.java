package com.synisys.design_patterns.bridge.abstraction;

import com.synisys.design_patterns.bridge.implementer.TrafficFactory;
import com.synisys.design_patterns.bridge.utils.TrafficDireciton;

/**
 * Created by haykanush.torchyan on 11/17/2014.
 */
public class Bus extends Car{

    public Bus(TrafficDireciton direciton){
        this.traffic = TrafficFactory.getTraffic(direciton);
    }

    public void move(){
        System.out.print("Driving a bus ... ");
        super.move();
    }
}
