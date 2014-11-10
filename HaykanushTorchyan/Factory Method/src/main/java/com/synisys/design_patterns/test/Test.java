package com.synisys.design_patterns.test;

import com.synisys.design_patterns.domain.CommonMotor;
import com.synisys.design_patterns.domain.InjectorMotor;
import com.synisys.design_patterns.factory.CommonMotorMechanic;
import com.synisys.design_patterns.factory.InjectorMotorMechanic;

/**
 * Created by haykanush.torchyan on 11/7/2014.
 */
public class Test {

    public static void main(String[] args){
        InjectorMotor injectorMotor = new InjectorMotor();
        InjectorMotorMechanic injectorMechanic = new InjectorMotorMechanic();
        injectorMotor = injectorMechanic.repairMotor(injectorMotor);

        CommonMotor commonMotor = new CommonMotor();
        CommonMotorMechanic commonMechanic = new CommonMotorMechanic();
        commonMotor = commonMechanic.repairMotor(commonMotor);
    }

}
