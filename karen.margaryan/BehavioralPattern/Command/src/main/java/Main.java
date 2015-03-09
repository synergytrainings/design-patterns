import command.Command;
import command.Sleep;
import command.Walk;
import invoker.HumanInvoker;
import receiver.Human;

/**
 * Created by Karen on 3/10/2015.
 */
public class Main {

    public static void main(String ... args) {

        Human human = new Human();
        Command walk = new Walk(human);
        Command sleep = new Sleep(human);

        HumanInvoker humanInvoker = new HumanInvoker();

        String programArgument = "sleep"; // args[1]
        programArgument = programArgument.toUpperCase();

        switch(programArgument) {
            case "SLEEP":
                humanInvoker.addToQueueAndExecute(sleep);
                break;

            case "WALK":
                humanInvoker.addToQueueAndExecute(walk);
                break;

            default:

        }
    }

}
