package com.synisys.design_patterns.factory;

import com.synisys.design_patterns.domain.CommonMotor;
import com.synisys.design_patterns.domain.InjectorMotor;
import com.synisys.design_patterns.domain.Motor;

/**
 * Created by haykanush.torchyan on 11/7/2014.
 */
public class MotorFactory {

    public Motor produceMotor(MotorType type){
        switch (type){
            case COMMON:
                return new CommonMotor();
            case INJECTOR:
                return new InjectorMotor();
        }
        return null;
    }

    public enum MotorType{
        INJECTOR,
        COMMON
    }
}
