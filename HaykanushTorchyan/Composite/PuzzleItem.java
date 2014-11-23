package com.synisys.design_patters.composite;

import java.util.Map;

/**
 * Created by haykanush.torchyan on 11/22/2014.
 */
public abstract class PuzzleItem {

     protected Coordinate coordinate;

    public void position(Coordinate newCoordinate){
        this.coordinate = newCoordinate;
    }

    public abstract void rotate();

    public void addPuzzleItem(PuzzleItem item, Coordinate coordinate) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    /**
     * a method to remove the PuzzleItem itself
     */
    public abstract void deletePuzzleItem();

    public Map<PuzzleItem, Coordinate> getChildren() throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }
}

