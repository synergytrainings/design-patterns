package com.synisys.design_patterns.decorator_pattern.decorator;

import com.synisys.design_patterns.decorator_pattern.component.CarTunning;

/**
 * Created by haykanush.torchyan on 11/24/2014.
 */
public class BandageTunning extends CarTunningDecorator {

    public BandageTunning(CarTunning tuningObject){
        super(tuningObject);
    }

    @Override
    public void tune(){
        super.tune();
        getTuningObject().getSpares().append(", bandage");
    }
}
