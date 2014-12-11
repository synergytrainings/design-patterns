package com.armen.mkrtchyan.command.chesstable;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 12, 2014</pre>
 */
public class Piece {

    private final PieceType type;
    private final PieceColor color;

    public Piece(PieceType type, PieceColor color) {
        this.type = type;
        this.color = color;
    }

    public PieceType getType() {
        return type;
    }

    public PieceColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return StringUtils.center(type + "/" + color, 13);
    }
}
