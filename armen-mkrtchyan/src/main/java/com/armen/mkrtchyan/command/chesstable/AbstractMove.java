package com.armen.mkrtchyan.command.chesstable;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 12, 2014</pre>
 */
public abstract class AbstractMove implements Move {

    private final ChessBoard board;

    public AbstractMove(ChessBoard board) {
        this.board = board;
    }

    protected ChessBoard getBoard() {
        return board;
    }
}
