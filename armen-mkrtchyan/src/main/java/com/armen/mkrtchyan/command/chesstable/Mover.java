package com.armen.mkrtchyan.command.chesstable;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 12, 2014</pre>
 */
public class Mover {

    private final Deque<Move> moveHistoryStack = new ArrayDeque<>();


    public void performMove(Move currentMove) {
        moveHistoryStack.push(currentMove);
        currentMove.move();
    }

    public void undoLastMove() {
        moveHistoryStack.pop().undoMove();
    }

}
