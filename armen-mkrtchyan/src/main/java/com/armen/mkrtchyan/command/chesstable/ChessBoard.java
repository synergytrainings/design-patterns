package com.armen.mkrtchyan.command.chesstable;

import java.util.Arrays;

import static com.armen.mkrtchyan.command.chesstable.PieceColor.BLACK;
import static com.armen.mkrtchyan.command.chesstable.PieceColor.WHITE;
import static com.armen.mkrtchyan.command.chesstable.PieceType.*;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 12, 2014</pre>
 */
public class ChessBoard {

    private final Piece[][] positions = {
            {new Piece(ROOK, WHITE), new Piece(KNIGHT, WHITE), new Piece(BISHOP, WHITE), new Piece(QUEEN, WHITE), 
                    new Piece(KING, WHITE), new Piece(BISHOP, WHITE), new Piece(KNIGHT, WHITE), new Piece(ROOK, WHITE)},
            {new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), 
                    new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), new Piece(PAWN, WHITE) },
            {null, null, null, null, null, null, null, null },
            {null, null, null, null, null, null, null, null },
            {null, null, null, null, null, null, null, null },
            {null, null, null, null, null, null, null, null },
            {new Piece(PAWN, BLACK), new Piece(PAWN, BLACK), new Piece(PAWN, BLACK), new Piece(PAWN, BLACK),
                    new Piece(PAWN, BLACK), new Piece(PAWN, BLACK), new Piece(PAWN, BLACK), new Piece(PAWN, BLACK) },
            {new Piece(ROOK, BLACK), new Piece(KNIGHT, BLACK), new Piece(BISHOP, BLACK), new Piece(QUEEN, BLACK),
                    new Piece(KING, BLACK), new Piece(BISHOP, BLACK), new Piece(KNIGHT, BLACK), new Piece(ROOK, BLACK)}
    };

    public Piece[][] getPositions() {
        return positions;
    }

    public void draw() {
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Piece[] position : positions) {
            for (Piece aPosition : position) {
                System.out.print(aPosition == null ? "             " : aPosition);
                System.out.print('|');
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

}
