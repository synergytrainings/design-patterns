package Decorators;

import Humans.Human;

/**
 * Created by Aram on 11/23/2014.
 */
public abstract class HumanDecorator implements Human {
    protected Human human;

    public HumanDecorator(Human human) {
        this.human = human;
    }

    @Override
    public void Walk() {
        human.Walk();
    }

    @Override
    public void Talk() {
        human.Talk();
    }

    @Override
    public void Run() {
        human.Run();
    }
}
