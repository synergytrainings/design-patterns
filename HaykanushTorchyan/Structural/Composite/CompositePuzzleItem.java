package com.synisys.design_patters.composite;

import java.util.*;

/**
 * Created by haykanush.torchyan on 11/22/2014.
 */
public class CompositePuzzleItem extends PuzzleItem {

    private Map<PuzzleItem, Coordinate> children = new HashMap<PuzzleItem, Coordinate>();

    @Override
    public void rotate() {
        System.out.println("Rotating a COMPOSITION of single puzzle items considering the coordinates of each of them");
    }

    @Override
    public void position(Coordinate coordinate){
        super.position(coordinate);
        Collection<Coordinate> childrenCoordinates = children.values();
        System.out.print("Positioning the composition... ");
        System.out.println("Computing the coordinates of all child items...");
        // code for computing child items' coordinates in childrenCoordinates list
        for(Coordinate xy : childrenCoordinates){
            System.out.println(xy.toString() + " coordinate is occupied");
        }
    }

    @Override
    public void addPuzzleItem(PuzzleItem puzzleItem, Coordinate coordinate){
        if(!children.containsValue(coordinate)){
            children.put(puzzleItem, coordinate);
        } else {
            System.out.println("Can't add puzzle item at this coordinate " + coordinate.toString());
        }
    }

    @Override
    public  void deletePuzzleItem(){
        for(Coordinate coordinate : children.values()) {
            System.out.println("Setting" + coordinate.toString() + " coordinate free");
        }
    }

    @Override
    public Map<PuzzleItem, Coordinate> getChildren() {
        return children;
    }
}
