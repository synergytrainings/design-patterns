package com.synisys.design_patterns.flyweight.flywieght;

import com.synisys.design_patterns.flyweight.flywieght.utilities.BrickParameters;

/**
 * Created by haykanush.torchyan on 12/2/2014.
 */
public class Brick extends BuildingMaterial {

    private BrickParameters brickParameters;

    protected Brick(BrickParameters brickParameters){
        this.brickParameters = brickParameters;
    }

    @Override
    public void draw(Integer x, Integer y, Integer z){
        System.out.println("Draw a brick on x:" + x + " y:" + y + " z:" + z + " coordinate");
    }
}
