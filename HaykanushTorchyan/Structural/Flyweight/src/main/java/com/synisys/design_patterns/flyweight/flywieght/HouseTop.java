package com.synisys.design_patterns.flyweight.flywieght;

/**
 * Created by haykanush.torchyan on 12/2/2014.
 */
public class HouseTop extends BuildingMaterial {

    private Integer length;
    private Integer width;

    protected HouseTop(Integer length, Integer width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(Integer x, Integer y, Integer z){
        System.out.println("Draw a housetop on x:" + x + " y:" + y + " z:" + z + " coordinate");
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
