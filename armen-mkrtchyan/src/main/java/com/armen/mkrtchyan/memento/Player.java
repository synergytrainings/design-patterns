package com.armen.mkrtchyan.memento;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class Player {

    private String position;
    private int ammo;
    private int onlineFriends;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getOnlineFriends() {
        return onlineFriends;
    }

    public void setOnlineFriends(int onlineFriends) {
        this.onlineFriends = onlineFriends;
    }

    public PlayerMemento createMemento() {
        return new PlayerMemento(ammo, position);
    }

    public void restoreFromMemento(PlayerMemento playerMemento) {
        this.ammo = playerMemento.ammo;
        this.position = playerMemento.position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "position='" + position + '\'' +
                ", ammo=" + ammo +
                ", onlineFriends=" + onlineFriends +
                '}';
    }

    public class PlayerMemento {

        private final int ammo;
        private final String position;

        private PlayerMemento(int ammo, String position) {
            this.ammo = ammo;
            this.position = position;
        }
    }

}
