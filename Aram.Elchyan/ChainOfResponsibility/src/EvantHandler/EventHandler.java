package EvantHandler;

import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by Aram on 12/4/2014.
 */
public abstract class EventHandler {
    protected Map<String, Function<Void, Void>> handlers;

    public EventHandler() {
        handlers = new HashMap<>();
    }

    public void HandleEvent(String eventName) {
        Function<Void, Void> handler = handlers.get(eventName);
        if (handler != null) {
            handler.apply(null);
        }
    }

    public void setEventHandler(String eventName, Function<Void, Void> handler) {
        this.handlers.put(eventName, handler);
    }
}
