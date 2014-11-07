package com.synisys.design_patterns.factory;

import com.synisys.design_patterns.domain.CommonMotor;
import com.synisys.design_patterns.domain.Motor;

/**
 * Created by haykanush.torchyan on 11/7/2014.
 */
public class CommonMotorMechanic implements MotorMechanic {

    @Override
    public CommonMotor repairMotor(Motor motor){
        //specific code for repairing common Motors
        return new CommonMotor();
    }
}
