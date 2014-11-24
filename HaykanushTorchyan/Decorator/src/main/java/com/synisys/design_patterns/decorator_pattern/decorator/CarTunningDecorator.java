package com.synisys.design_patterns.decorator_pattern.decorator;

import com.synisys.design_patterns.decorator_pattern.component.CarTunning;

/**
 * Created by haykanush.torchyan on 11/24/2014.
 */
public abstract class CarTunningDecorator extends CarTunning {

    private CarTunning tuningObject;

    protected CarTunningDecorator(CarTunning tuningObject){
        this.tuningObject = tuningObject;
    }

    @Override
    public void tune(){
        tuningObject.tune();
    }

    @Override
    public StringBuilder getSpares(){
        return getTuningObject().getSpares();
    }

    protected CarTunning getTuningObject() {
        return tuningObject;
    }

    protected void setTuningObject(CarTunning tuningObject) {
        this.tuningObject = tuningObject;
    }
}
