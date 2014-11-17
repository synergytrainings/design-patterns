package com.synisys.design_patterns.bridge.abstraction;

import com.synisys.design_patterns.bridge.implementer.TrafficFactory;
import com.synisys.design_patterns.bridge.utils.TrafficDireciton;

/**
 * Created by haykanush.torchyan on 11/17/2014.
 */
public class FamilyCar extends Car{

    public FamilyCar(TrafficDireciton direciton){
        this.traffic = TrafficFactory.getTraffic(direciton);
    }

    public void move(){
        System.out.print("Driving a family car ... ");
        super.move();
    }
}
