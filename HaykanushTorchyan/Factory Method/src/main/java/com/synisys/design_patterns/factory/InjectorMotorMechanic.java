package com.synisys.design_patterns.factory;

import com.synisys.design_patterns.domain.InjectorMotor;
import com.synisys.design_patterns.domain.Motor;

/**
 * Created by haykanush.torchyan on 11/7/2014.
 */
public class InjectorMotorMechanic implements MotorMechanic {

    @Override
    public InjectorMotor repairMotor(Motor motor){
        //specific code for repairing injector Motors
        return new InjectorMotor();
    }
}
