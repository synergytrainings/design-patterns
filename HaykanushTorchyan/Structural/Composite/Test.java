package com.synisys.design_patters.composite;

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
        item.rotate();
        compositePuzzleItem.addPuzzleItem(item, new Coordinate(0,1));
        //change the position of the whole composition
        compositePuzzleItem.position(new Coordinate(3, 4));

        //make another composition of puzzle items
        CompositePuzzleItem compositePuzzleItem2 = new CompositePuzzleItem();
        //add a single puzzle item to compositePuzzleItem2 composition
        compositePuzzleItem2.addPuzzleItem(puzzleItems.get(43), new Coordinate(6, 8));
        //rotate the first composition
        compositePuzzleItem.rotate();
        //add the rotated composition two the second composition
        compositePuzzleItem2.addPuzzleItem(compositePuzzleItem, new Coordinate(6, 9));
    }
}
