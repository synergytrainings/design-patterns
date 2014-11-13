package com.synisys.training.patterns.prototype.prototypes;

/**
 * @author Anania.Mikaelyan
 * @since 11/7/2014
 */
public class Dog implements Animal {
    private String voice = "huf";

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public Animal doClone() {
        return new Dog(name);
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
