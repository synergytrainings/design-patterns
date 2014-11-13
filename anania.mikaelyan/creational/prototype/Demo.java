package com.synisys.training.patterns.prototype;

import com.synisys.training.patterns.prototype.prototypes.Animal;
import com.synisys.training.patterns.prototype.prototypes.Cat;
import com.synisys.training.patterns.prototype.prototypes.Dog;

/**
 * @author Anania.Mikaelyan
 * @since 11/7/2014
 */
public class Demo {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Tom");
        System.out.println("Cat " + animal1.getName() + " says " + animal1.getVoice());

        //A client asks a prototype to clone itself.
        Animal animal2 = animal1.doClone();
        System.out.println("Cat " + animal2.getName() + " says " + animal2.getVoice());

        Animal animal3 = new Dog("Goofy");
        System.out.println("Dog " + animal3.getName() + " says " + animal3.getVoice());

        //A client asks a prototype to clone itself.
        Animal animal4 = animal3.doClone();
        System.out.println("Dog " + animal4.getName() + " says " + animal4.getVoice());
    }
}
