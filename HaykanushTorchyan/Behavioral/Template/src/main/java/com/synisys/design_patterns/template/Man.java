package com.synisys.design_patterns.template;

import com.synisys.design_patterns.template.enums.Location;
import com.synisys.design_patterns.template.enums.Meal;
import com.synisys.design_patterns.template.enums.Outwear;
import com.synisys.design_patterns.template.enums.Transport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haykanush.torchyan on 4/17/2015.
 */
public abstract class Man {

    private Outwear wear;
    private Transport transport;
    private List<Meal> meals = new ArrayList<Meal>();
    private Location location = Location.HOME;

    public final void dailyRoutine(){
        getUp();
        goToWork();
        work();
        lunchBreak();
        work();
        returnHome();
        sleep();
    }

    public abstract  void getUp();

    public abstract  void lunchBreak();

    public void goToWork(){
        chooseTransport();
        location = Location.WORKPLACE;
    }

    protected void setWear(Outwear wear) {
        this.wear = wear;
    }

    protected abstract void chooseTransport();

    protected abstract void work();

    protected void returnHome(){
        location = Location.HOME;
    }

    protected void sleep(){
        // Sleep :)
    }

    protected void setTransport(Transport transport) {
        this.transport = transport;
    }

    protected List<Meal> getMeals() {
        return meals;
    }
}
