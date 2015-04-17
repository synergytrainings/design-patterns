package com.synisys.design_patterns.template;

import com.synisys.design_patterns.template.enums.Meal;
import com.synisys.design_patterns.template.enums.Outwear;
import com.synisys.design_patterns.template.enums.Transport;

/**
 * Created by haykanush.torchyan on 4/17/2015.
 */
public class PostMan extends Man {

    @Override
    public void getUp(){
        setWear(Outwear.POSTMAN_OUTWEAR);
    }

    @Override
    public void lunchBreak() {
        getMeals().add(Meal.HOTDOG);
    }

    @Override
    protected void chooseTransport() {
        setTransport(Transport.BUS);
    }

    @Override
    protected void work() {
        // Deliver mail
    }
}
