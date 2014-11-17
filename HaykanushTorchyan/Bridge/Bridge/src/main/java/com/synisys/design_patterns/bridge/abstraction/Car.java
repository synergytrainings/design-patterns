package com.synisys.design_patterns.bridge.abstraction;

import com.synisys.design_patterns.bridge.implementer.Traffic;
import com.synisys.design_patterns.bridge.implementer.TrafficFactory;
import com.synisys.design_patterns.bridge.utils.TrafficDireciton;

/**
 * Created by haykanush.torchyan on 11/17/2014.
 */
public abstract class Car {

    protected Traffic traffic;

    public void move(){
        traffic.drive();
    }

    public void changeTrafficDirectionTo(TrafficDireciton direciton){
        traffic = TrafficFactory.getTraffic(direciton);
    }

}
