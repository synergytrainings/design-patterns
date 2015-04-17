package com.synisys.design_patterns.template;

import com.synisys.design_patterns.template.enums.Meal;
import com.synisys.design_patterns.template.enums.Outwear;
import com.synisys.design_patterns.template.enums.Transport;

/**
 * Created by haykanush.torchyan on 4/17/2015.
 */
public class SynergyEmployee extends Man {

    @Override
    public void getUp(){
        setWear(Outwear.STYLISH_OUTWEAR);
    }

    @Override
    public void lunchBreak() {
        getMeals().add(Meal.SYNERGY_CAFETERIA_MEAL);
    }

    @Override
    protected void chooseTransport() {
        setTransport(Transport.CAR);
    }

    @Override
    protected void work() {
        // Write code
    }
}
