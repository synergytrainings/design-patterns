package com.synisys.design_patterns.bridge.implementer;

import com.synisys.design_patterns.bridge.utils.TrafficDireciton;

/**
 * Created by haykanush.torchyan on 11/17/2014.
 */
public class TrafficFactory {
    
    public static Traffic getTraffic(TrafficDireciton direciton){
        switch (direciton){
            case RIGHT_WAY:
                return new RightWayTraffic();
            case LEFT_WAY:
                return new LeftWayTraffic();
        }
        return null;
    }
}
