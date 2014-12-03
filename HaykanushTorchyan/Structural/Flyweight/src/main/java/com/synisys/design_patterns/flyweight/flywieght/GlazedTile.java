package com.synisys.design_patterns.flyweight.flywieght;

import com.synisys.design_patterns.flyweight.flywieght.utilities.GlazedTileParameters;

/**
 * Created by haykanush.torchyan on 12/2/2014.
 */
public class GlazedTile extends BuildingMaterial {

    private GlazedTileParameters glazedTileParameters;

    protected GlazedTile(GlazedTileParameters glazedTileParameters){
        this.glazedTileParameters = glazedTileParameters;
    }

    @Override
    public void draw(Integer x, Integer y, Integer z){
        System.out.println("Draw a glazed tile on x:" + x + " y:" + y + " z:" + z + " coordinate");
    }
}
