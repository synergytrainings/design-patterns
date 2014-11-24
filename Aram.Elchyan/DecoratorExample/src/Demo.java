import Decorators.HatDecorator;
import Decorators.WatchDecorator;
import Humans.Human;
import Humans.Man;

public class Demo {

    public static void main(String[] args) {
        Human human = new WatchDecorator(new HatDecorator(new Man()));

        human.Walk();
        human.Talk();
        human.Run();
    }
}
