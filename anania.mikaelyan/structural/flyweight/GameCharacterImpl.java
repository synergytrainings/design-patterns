package com.synisys.training.patterns.structural.flyweight;

/**
 * ConcreteFlyweight -
 * implements the Flyweight interface and adds storage for intrinsic state, if any.
 * A  ConcreteFlyweight object must be sharable.
 * Any state it stores must be independent of ConcreteFlyweight object's  context.
 * @author Anania.Mikaelyan
 * @since 12/1/2014
 */
public class GameCharacterImpl implements GameCharacter {
    /**
     * Intrinsic State maintained by flyweight implementation
     * Character Shape ( graphical representation)
     * how to display the character is up to the flyweight implementation
     */
    private Object gameCharacterGraphicalRepresentation;
    @Override
    public void move(Coordinate current, Coordinate next) {
        // delete character representation from current location
        // then render character representation in next location
    }
}
