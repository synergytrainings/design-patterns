package com.armen.mkrtchyan.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class SaveManager {

    private final Player.PlayerMemento[] saveSlots = new Player.PlayerMemento[10];

    public void save(Player player, int slot) {
        saveSlots[slot] =  player.createMemento();
    }

    public void load(Player player, int slot) {
        player.restoreFromMemento(saveSlots[slot]);
    }
    
}
