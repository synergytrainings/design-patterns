package com.synisys.design_patterns.template;

/**
 * Created by haykanush.torchyan on 4/17/2015.
 */
public class Test {

    public static void main(String... args){
        FireFighter fireFighter = new FireFighter();
        PostMan postMan = new PostMan();
        SynergyEmployee synergyEmployee = new SynergyEmployee();

        fireFighter.dailyRoutine();
        postMan.dailyRoutine();
        synergyEmployee.dailyRoutine();
    }
}
