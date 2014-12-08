package com.synisys.design_patters.chainOfResponsibility;

import com.synisys.design_patters.chainOfResponsibility.utilities.Coordinate;

import java.util.*;

/**
 * Created by haykanush.torchyan on 11/22/2014.
 */
public class CompositePuzzleItem extends PuzzleItem {

    private Map<Coordinate, PuzzleItem> children = new HashMap<Coordinate, PuzzleItem>();

    @Override
    public void addPuzzleItem(PuzzleItem puzzleItem, Coordinate coordinate){
        if(!children.containsKey(coordinate)){
            children.put(coordinate, puzzleItem);
        } else {
            System.out.println("Can't add puzzle item at this coordinate " + coordinate.toString());
        }
    }

    @Override
    // Handler function
    public void moveTo(Coordinate newCoordinate){
        // if this composition is not contained in another composition
        // than it is responsible for this request (move to new coordinate)
        if(this.parent==null) {
            for(PuzzleItem child : children.values()){
                Coordinate currentChildCoordinate = null;
                // code for computing coordinate for current child - currentChildCoordinate
                child.setCoordinate(currentChildCoordinate);
            }
        }
        // if parent!=null that means that this composition has a parent container
        // which must handle this moveTo request
        else {
            super.moveTo(newCoordinate);
        }
    }


    @Override
    // Handler function
    public void rotate() {
        // if this composition is not contained in another composition
        // than it is responsible for this request (move to new coordinate)
        if(this.parent==null) {
            System.out.println("Rotating a COMPOSITION of puzzle items considering the coordinates of each of them");
            // code for rotating the whole composition
        }
        // if parent!=null that means that this composition has a parent container
        // which must handle this moveTo request
        else {
            super.rotate();
        }
    }

    @Override
    public boolean isComposite(){
        return true;
    }

    @Override
    public void setCoordinate(Coordinate newCoordinate){
        System.out.print("Positioning the composition... ");
        System.out.println("Computing the coordinates of all child items...");
        for(PuzzleItem child : children.values()){
            Coordinate currentChildCoordinate = null;
            // code for computing coordinate for current child - currentChildCoordinate
            child.setCoordinate(currentChildCoordinate);
            System.out.println(currentChildCoordinate.toString() + " coordinate is occupied");
        }
    }

    @Override
    public  void deletePuzzleItem(){
        for(Coordinate coordinate : children.keySet()) {
            System.out.println(coordinate.toString() + " coordinate free");
        }
    }

    @Override
    public Map<Coordinate, PuzzleItem> getChildren() {
        return children;
    }
}
