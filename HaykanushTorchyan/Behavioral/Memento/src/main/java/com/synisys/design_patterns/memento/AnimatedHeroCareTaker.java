package com.synisys.design_patterns.memento;

import java.util.Stack;

/**
 * Created by haykanush.torchyan on 4/3/2015.
 */
public class AnimatedHeroCareTaker {

    // a list of Memento objects to use on undo action
    private Stack undoHistory;
    // a list of Memento objects to use on redo action
    private Stack redoHistory;

    private AnimatedHero hero;

    public AnimatedHeroCareTaker(AnimatedHero hero){
        this.hero = hero;
        undoHistory = new Stack();
        redoHistory = new Stack();
    }

    public void save(){
        this.undoHistory.push(hero.save());
        this.redoHistory = new Stack();
    }

    public void undo(){
        Object revertToState = undoHistory.pop();
        hero.revertToState(revertToState);
        redoHistory.push(revertToState);
    }

    public void redo(){
        Object revertToState = redoHistory.pop();
        hero.revertToState(revertToState);
        undoHistory.push(revertToState);
    }

    public String printHeroState(){
        return "Height: " + hero.getHeight() +
                "\nEye color: " + hero.getEyeColor() +
                "\nHair color: " + hero.getHairColor();
    }

}
