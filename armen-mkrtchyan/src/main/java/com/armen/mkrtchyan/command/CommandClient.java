package com.armen.mkrtchyan.command;

import com.armen.mkrtchyan.command.chesstable.ChessBoard;
import com.armen.mkrtchyan.command.chesstable.Mover;
import com.armen.mkrtchyan.command.chesstable.SimpleMove;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 12, 2014</pre>
 */
public class CommandClient {

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        Mover mover = new Mover();
        mover.performMove(new SimpleMove(chessBoard, "E2", "E4"));
        mover.performMove(new SimpleMove(chessBoard, "D7", "D5"));
        mover.performMove(new SimpleMove(chessBoard, "E4", "D5"));
        chessBoard.draw();
        mover.undoLastMove();
        chessBoard.draw();
    }

}
