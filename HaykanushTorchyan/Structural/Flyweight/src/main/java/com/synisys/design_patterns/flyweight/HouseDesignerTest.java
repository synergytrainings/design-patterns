package com.synisys.design_patterns.flyweight;

import com.synisys.design_patterns.flyweight.flywieght.Brick;
import com.synisys.design_patterns.flyweight.flywieght.BuildingMaterialFactory;
import com.synisys.design_patterns.flyweight.flywieght.GlazedTile;
import com.synisys.design_patterns.flyweight.flywieght.HouseTop;
import com.synisys.design_patterns.flyweight.flywieght.utilities.BrickParameters;
import com.synisys.design_patterns.flyweight.flywieght.utilities.GlazedTileParameters;

/**
 * Created by haykanush.torchyan on 12/2/2014.
 */
public class HouseDesignerTest {

    public static void main(String... args){
        BrickParameters brickParameters = new BrickParameters(2, 2, 4);
        for(int y = 10; y < 30; y++){
            for(int z = 25; z < 50; z++){
                Brick brick = BuildingMaterialFactory.getBrick(brickParameters);
                brick.draw(10, y, z);
            }
        }

        GlazedTileParameters glazedTileParameters = new GlazedTileParameters("beige", 2);
        for(int y = 10; y < 30; y++){
            for(int z = 25; z < 50; z++){
                GlazedTile glazedTile = BuildingMaterialFactory.getGlazedTile(glazedTileParameters);
                glazedTile.draw(10, y, z);
            }
        }

        //...draw the other walls of the house

        // a single housetop object must be drawn on the top of the house
        HouseTop houseTop = BuildingMaterialFactory.getHouseTop(100, 40);
        houseTop.draw(10, 30, 50);
    }
}
