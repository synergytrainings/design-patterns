import Commands.DecreaseTemperatureCommand;
import Commands.IncreaseTemperatureCommand;
import Invokers.RemoteButton;
import Receivers.Condition;
import Receivers.Curtains;
import Receivers.Door;
import Receivers.Lights;

public class Demo {

    public static void main(String[] args) {
        Condition condition = new Condition();
        Curtains curtains = new Curtains();
        Door door = new Door();
        Lights lights = new Lights();

        HomeRemote remote = new HomeRemote();

        RemoteButton btnTemperaturePlus = new RemoteButton();
        btnTemperaturePlus.setCommand(new IncreaseTemperatureCommand(condition));
        remote.AddRemoteButton("temperaturePlus", btnTemperaturePlus);

        RemoteButton btnTemperatureMinus = new RemoteButton();
        btnTemperaturePlus.setCommand(new DecreaseTemperatureCommand(condition));
        remote.AddRemoteButton("temperatureMinus", btnTemperatureMinus);

        //and same for all the other buttons


        remote.PressButton("temperaturePlus");
        remote.PressButton("temperaturePlus");
        remote.PressButton("temperaturePlus");
        remote.PressButton("temperaturePlus");
    }
}
