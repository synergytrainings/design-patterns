package com.synisys.training.patterns.structural.flyweight;

/**
 * Flyweight - declares an interface through which flyweights can receive and act on extrinsic state.
 *
 * @author Anania.Mikaelyan
 * @since 12/1/2014
 */
public interface GameCharacter {
    /**
     * Move GameCharacter From current location to New Location
     * Note that GameCharacter location is extrinsic state
     * @param current
     * @param next
     */
    void move(Coordinate current, Coordinate next);


    static class Coordinate{
        private final float x;
        private final float y;


        public Coordinate(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }
    }
}
