package com.synisys.design_patterns.test;

import com.synisys.design_patterns.domain.Motor;
import com.synisys.design_patterns.factory.MotorFactory;

/**
 * Created by haykanush.torchyan on 11/7/2014.
 */
public class Test {

    public static void main(String[] args){
        MotorFactory motorFactory = new MotorFactory();
        Motor commonMotor = motorFactory.produceMotor(MotorFactory.MotorType.COMMON);
        commonMotor.run();

        Motor injectorMotor = motorFactory.produceMotor(MotorFactory.MotorType.INJECTOR);
        injectorMotor.run();
    }

}
