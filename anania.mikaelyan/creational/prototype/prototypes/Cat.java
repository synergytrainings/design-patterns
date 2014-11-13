package com.synisys.training.patterns.prototype.prototypes;

/**
 * @author Anania.Mikaelyan
 * @since 11/7/2014
 */
public class Cat implements Animal {
    private String voice = "myua";
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public Animal doClone() {
        return new Cat(voice);
    }

    @Override
    public String getVoice() {
        return voice;
    }

    @Override
    public String getName() {
        return name;
    }
}
