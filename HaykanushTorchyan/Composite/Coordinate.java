package com.synisys.design_patters.composite;

/**
 * Created by haykanush.torchyan on 11/22/2014.
 */
public class Coordinate {

    private Integer x;
    private Integer y;

    public Coordinate(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "x:" + x + " y:" + y;
    }
}
