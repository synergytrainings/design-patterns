package command;

import receiver.Human;

/**
 * Created by Karen on 3/10/2015.
 */
public class Walk implements Command{

    private Human human;

    public Walk(Human human) {
        this.human = human;
    }

    @Override
    public void execute() {
        human.walk();
    }
}
