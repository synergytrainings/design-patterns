package com.synisys.design_patterns.test;

import com.synisys.design_patterns.memento.AnimatedHero;
import com.synisys.design_patterns.memento.AnimatedHeroCareTaker;
import com.synisys.design_patterns.memento.utils.AnimatedHeroType;

/**
 * Created by haykanush.torchyan on 4/3/2015.
 */
public class Test {

    public static void main(String... args){
        AnimatedHero hero = new AnimatedHero(AnimatedHeroType.BOY);
        AnimatedHeroCareTaker careTaker = new AnimatedHeroCareTaker(hero);

        // make the first change and save
        hero.setHeight(60);
        hero.setEyeColor("blue");
        hero.setHairColor("red");
        careTaker.save();

        // do next change and save
        hero.setEyeColor("green");
        careTaker.save();

        hero.setEyeColor("black");
        // undo last change
        careTaker.undo();

        // do another change and again save
        hero.setHairColor("orange");
        careTaker.save();

        hero.setHeight(80);
        careTaker.save();

        careTaker.undo();
        careTaker.undo();
        careTaker.redo();

        System.out.println(careTaker.printHeroState());
    }
}
