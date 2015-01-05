package Invokers;

import Commands.HomeCommand;

import java.awt.*;

/**
 * Created by Aram on 12/22/2014.
 */
public class RemoteButton {
    private HomeCommand command;

    private double length;

    private double width;

    private double positionX;

    private double positionY;

    private Image icon;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setCommand(HomeCommand command) {
        this.command = command;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public void setIcon(Image icon) {
        this.icon = icon;
    }

    public Image getIcon() {
        return icon;
    }

    public void Press() {
        command.ExecuteCommand();
    }
}
