package com.armen.mkrtchyan.command.chesstable;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 12, 2014</pre>
 */
public class SimpleMove extends AbstractMove {

    private final byte[] from;
    private final byte[] to;

    private Piece takenPiece;

    public SimpleMove(ChessBoard board, String from, String to) {
        super(board);
        this.from = convert(from.toCharArray());
        this.to = convert(to.toCharArray());
    }

    @Override
    public void move() {
        Piece movingPiece = getBoard().getPositions()[from[0]][from[1]];
        this.takenPiece = getBoard().getPositions()[to[0]][to[1]];
        getBoard().getPositions()[to[0]][to[1]] = movingPiece;
        getBoard().getPositions()[from[0]][from[1]] = null;
    }

    @Override
    public void undoMove() {
        getBoard().getPositions()[from[0]][from[1]] = getBoard().getPositions()[to[0]][to[1]];
        getBoard().getPositions()[to[0]][to[1]] = takenPiece;
    }

    private static byte[] convert(char[] chars) {
        byte[] bytes = new byte[2];
        bytes[1] = (byte) (chars[0] - 65);
        bytes[0] = (byte) (chars[1] - 49);
        return bytes;
    }
}
