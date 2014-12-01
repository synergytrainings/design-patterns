package com.synisys.training.patterns.structural.flyweight;

/**
 * Client - maintains a reference to flyweight(s).
 * computes or stores the extrinsic state of flyweight(s)
 * @author Anania.Mikaelyan
 * @since 12/1/2014
 */
public class GameCharacterClient {
    /**
     * Reference to the flyweight
     */
    private GameCharacter gameCharacter = GameCharacterFactory.getGameCharacter();

    /**
     * this state is maintained by the client 
     */
    private GameCharacter.Coordinate current = new GameCharacter.Coordinate(0,0);


    public void moveGameCharacter(GameCharacter.Coordinate newCoordinate){

        // here the actual rendering is handled by the flyweight object 
        gameCharacter.move(current, newCoordinate);

        // this object is responsible for maintaining the state
        // that is extrinsic to the flyweight
        current = newCoordinate;
    }
}
