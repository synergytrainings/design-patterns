package com.synisys.training.patterns.structural.flyweight;

/**
 * FlyweightFactory
 * creates and manages flyweight objects. ensures that flyweights are shared properly.
 * When a client requests a flyweight, the FlyweightFactory object supplies an existing instance or creates one, if none exists.
 * @author Anania.Mikaelyan
 * @since 12/1/2014
 */
public class GameCharacterFactory {
    /**
     * Pool for one soldier only
     * if there are more soldier types
     * this can be an array or list or better a HashMap
     */
    private static GameCharacter GAME_CHARACTER;

    /**
     * getFlyweight
     * @return
     */
    public static GameCharacter getGameCharacter(){
        // this is a singleton
        // if there is no game character
        if(GAME_CHARACTER==null){
            // create the game character
            GAME_CHARACTER = new GameCharacterImpl();
        }
        // return the only game character reference
        return GAME_CHARACTER;
    }
}
