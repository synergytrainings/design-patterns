package com.synisys.design_patterns.memento;

import com.synisys.design_patterns.memento.utils.AnimatedHeroType;

/**
 * Created by haykanush.torchyan on 4/3/2015.
 */
public class AnimatedHero {

    private Integer height;
    private AnimatedHeroType type;
    private String eyeColor;
    private String hairColor;

    public AnimatedHero(AnimatedHeroType type){
        this.type = type;
    }

    protected Memento save(){
        return new Memento(height, eyeColor, hairColor);
    }

    protected void revertToState(Object revertToState){
        Memento memento = (Memento) revertToState;
        this.height = memento.height;
        this.eyeColor = memento.eyeColor;
        this.hairColor = memento.hairColor;
    }

    private class Memento{
        private Integer height;
        private String eyeColor;
        private String hairColor;

        private Memento(Integer height, String eyeColor, String hairColor){
            this.height = height;
            this.eyeColor = eyeColor;
            this.hairColor = hairColor;
        }
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
