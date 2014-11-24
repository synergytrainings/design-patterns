package Decorators;

import Humans.Human;

/**
 * Created by Aram on 11/23/2014.
 */
public class HatDecorator extends HumanDecorator {
    public HatDecorator(Human human) {
        super(human);
    }

    @Override
    public void Talk() {
        super.Talk();
        System.out.println("Look I've got a hat.");
    }
}
