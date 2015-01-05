import Invokers.RemoteButton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aram on 12/22/2014.
 */
public class HomeRemote {
    public Map<String, RemoteButton> buttons;

    public HomeRemote() {
        buttons = new HashMap<String, RemoteButton>();
    }

    public void AddRemoteButton(String name, RemoteButton button) {
        buttons.put(name, button);
    }

    public void PressButton(String name) {
        if(buttons.containsKey(name)) {
            buttons.get(name).Press();
        }
    }
}
