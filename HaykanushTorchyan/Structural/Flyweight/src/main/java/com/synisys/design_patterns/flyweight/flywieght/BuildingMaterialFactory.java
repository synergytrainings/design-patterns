package com.synisys.design_patterns.flyweight.flywieght;

import com.synisys.design_patterns.flyweight.flywieght.utilities.BrickParameters;
import com.synisys.design_patterns.flyweight.flywieght.utilities.GlazedTileParameters;

import javax.jnlp.IntegrationService;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by haykanush.torchyan on 12/2/2014.
 */
public class BuildingMaterialFactory {

    private static Map<BrickParameters, Brick> brickCache = new HashMap<BrickParameters, Brick>();
    private static Map<GlazedTileParameters, GlazedTile> glazedTileCache = new HashMap<GlazedTileParameters, GlazedTile>();

    /**
     * @param brickParameters
     * @return a brick with specified parameters from cache
     */
    public static Brick getBrick(BrickParameters brickParameters){
        Brick brick = brickCache.get(brickParameters);
        if(brick==null){
            brick = new Brick(brickParameters);
            brickCache.put(brickParameters, brick);
        }
        return brick;
    }

    /**
     * @param glazedTileParameters
     * @return a glazed tile with specified parameters from cache
     */
    public static GlazedTile getGlazedTile(GlazedTileParameters glazedTileParameters){
        GlazedTile glazedTile = glazedTileCache.get(glazedTileParameters);
        if(glazedTile==null){
            glazedTile = new GlazedTile(glazedTileParameters);
            glazedTileCache.put(glazedTileParameters, glazedTile);
        }
        return glazedTile;
    }

    /**
     * @param length
     * @param width
     * @return a new housetop for each call
     */
    public static HouseTop getHouseTop(Integer length, Integer width){
        return new HouseTop(length, width);
    }
}
