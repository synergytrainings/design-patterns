package com.synisys.design_patters.chainOfResponsibility;

import com.synisys.design_patters.chainOfResponsibility.utilities.Coordinate;

import java.util.Map;
import java.util.Objects;

/**
 * Created by haykanush.torchyan on 11/22/2014.
 */
public abstract class PuzzleItem {

    protected PuzzleItem parent;

    protected Coordinate coordinate;

    // HANDLER function
    public void moveTo(Coordinate newCoordinate) throws NullPointerException{
        if(parent!=null) {
            parent.moveTo(Objects.requireNonNull(newCoordinate));
        } else {
            throw new NullPointerException("Passed MOVETO request to a NULL parent to handle!");
        }
    }

    // HANDLER function
    public void rotate() throws NullPointerException{
        if(parent!=null) {
            parent.rotate();
        } else {
            throw new NullPointerException("Passed ROTATE request to a NULL parent to handle!");
        }
    }


    public boolean isComposite(){
        return false;
    }

    public void setCoordinate(Coordinate newCoordinate){
        this.coordinate = newCoordinate;
    }

    public void addPuzzleItem(PuzzleItem item, Coordinate coordinate) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    /**
     * a method to remove the PuzzleItem itself
     */
    public abstract void deletePuzzleItem();

    public Map<Coordinate, PuzzleItem> getChildren() throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }
}

