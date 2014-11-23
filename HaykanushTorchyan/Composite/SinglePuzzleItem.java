package com.synisys.design_patters.composite;

/**
 * Created by haykanush.torchyan on 11/22/2014.
 */
public class SinglePuzzleItem extends PuzzleItem{

    PuzzleItem parent;

    @Override
    public void rotate() {
        System.out.println("Rotating a single puzzle item");
    }

    @Override
    public void position(Coordinate coordinate){
        super.position(coordinate);
        System.out.println("Setting " + coordinate.toString() + " coordinate occupied");
    }

    @Override
    public  void deletePuzzleItem(){
        this.parent.getChildren().remove(this);
        System.out.println("Setting" + this.coordinate.toString() + " coordinate free");
    }
}
