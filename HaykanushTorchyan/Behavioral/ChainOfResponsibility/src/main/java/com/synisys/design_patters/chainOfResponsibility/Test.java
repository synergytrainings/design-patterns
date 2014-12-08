package com.synisys.design_patters.chainOfResponsibility;

import com.synisys.design_patters.chainOfResponsibility.utilities.Coordinate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haykanush.torchyan on 11/22/2014.
 */
public class Test {

    public static void main(String... args){
        List<PuzzleItem> puzzleItems = new ArrayList<PuzzleItem>();
        for(int i = 0; i<500; i++){
            puzzleItems.add(new SinglePuzzleItem());
        }

        //make a composition of two single puzzle items
        CompositePuzzleItem compositePuzzleItem = new CompositePuzzleItem();
        //add the first puzzle item to the composition
        compositePuzzleItem.addPuzzleItem(puzzleItems.get(0), new Coordinate(0,0));

        //pick another puzzle item, rotate and add to the composition
        PuzzleItem item = puzzleItems.get(44);
        // ROTATE REQUEST sent!!! handled by the SingePuzzleItem as it has no parent yet
        item.rotate();
        compositePuzzleItem.addPuzzleItem(item, new Coordinate(0,1));
        //consider the user drags the "item" puzzle item
        // MOVETO REUQEST sent!!! handled by the parent composition
        item.moveTo(new Coordinate(3, 4));

        //make another composition of puzzle items
        CompositePuzzleItem compositePuzzleItem2 = new CompositePuzzleItem();
        //add a single puzzle item to compositePuzzleItem2 composition
        compositePuzzleItem2.addPuzzleItem(puzzleItems.get(43), new Coordinate(6, 8));
        //add the rotated composition two the second composition
        compositePuzzleItem2.addPuzzleItem(compositePuzzleItem, new Coordinate(6, 9));
        // ROTATE REQUEST sent!!! handled by compositePuzzleItem2 parent composition
        compositePuzzleItem.rotate();
    }
}
