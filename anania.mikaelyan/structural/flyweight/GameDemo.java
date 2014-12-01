package com.synisys.training.patterns.structural.flyweight;

/**
 * @author Anania.Mikaelyan
 * @since 12/1/2014
 */
public class GameDemo {

    public static void main(String[] args) {
        // start war

        // draw war terrain

        // create 5 gameCharacters:
        GameCharacterClient warGameCharacters [] ={
                new GameCharacterClient(),
                new GameCharacterClient(),
                new GameCharacterClient(),
                new GameCharacterClient(),
                new GameCharacterClient()
        };

        // move each gameCharacter to his location
        // take user input to move each gameCharacter
        warGameCharacters[0].moveGameCharacter(new GameCharacter.Coordinate(17,2112));

        // 	take user input to move each gameCharacter
        warGameCharacters[1].moveGameCharacter(new GameCharacter.Coordinate(137, 112));

        // note that there is only one GameCharacterImp ( flyweight Imp)
        // for all the 5 gameCharacters
        // GameCharacter Client size is small due to the small state it maintains
        // GameCharacterImp size might be large or might be small
        // however we saved memory costs of creating 5 GameCharacter representations
    }
}
