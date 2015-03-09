package command;

import receiver.Human;

/**
 * Created by Karen on 3/10/2015.
 */
public class Sleep implements Command{
    private Human human;

    public Sleep(Human human) {
        this.human = human;
    }

    @Override
    public void execute() {
        human.sleep();
    }
}
