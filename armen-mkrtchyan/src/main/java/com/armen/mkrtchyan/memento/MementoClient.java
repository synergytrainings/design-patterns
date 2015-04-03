package com.armen.mkrtchyan.memento;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class MementoClient {

    public static void main(String[] args) {
        Player armen = new Player();
        armen.setAmmo(10000000);
        armen.setPosition("blah");
        armen.setOnlineFriends(100000000);
        SAVE_MANAGER.save(armen, 2);
        armen.setAmmo(999);
        SAVE_MANAGER.save(armen, 1);
        SAVE_MANAGER.load(armen, 2);
        System.out.println(armen);
        SAVE_MANAGER.load(armen, 1);
        System.out.println(armen);
    }

    public static final SaveManager SAVE_MANAGER = new SaveManager();

}
