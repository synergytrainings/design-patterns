package com.synisys.design_patters.chainOfResponsibility;

import com.synisys.design_patters.chainOfResponsibility.utilities.Coordinate;

/**
 * Created by haykanush.torchyan on 11/22/2014.
 */
public class SinglePuzzleItem extends PuzzleItem{

    @Override
    // Handler function
    public void moveTo(Coordinate newCoordinate){
        // if this single item is not contained in a composition
        // than it is responsible for this request (move to new coordinate)
        if(this.parent==null) {
            this.coordinate = newCoordinate;
            System.out.println(newCoordinate.toString() + " coordinate is occupied");
        }
        // if parent!=null that means that this item has a parent container
        // which must handle this moveTo request
        else {
            super.moveTo(newCoordinate);
        }
    }

    @Override
    // Handler function
    public void rotate() {
        // if this single item is not contained in a composition
        // than it is responsible for this request (move to new coordinate)
        if(this.parent==null) {
            System.out.println("Rotating a single puzzle item");
            // code for rotating this item
        }
        // if parent!=null that means that this item has a parent container
        // which must handle this moveTo request
        else {
            super.rotate();
        }
    }

    @Override
    public  void deletePuzzleItem(){
        this.parent.getChildren().remove(this);
        System.out.println(this.coordinate.toString() + " coordinate is free");
    }
}
