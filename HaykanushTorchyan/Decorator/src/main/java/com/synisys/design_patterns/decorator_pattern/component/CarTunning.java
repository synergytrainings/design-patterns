package com.synisys.design_patterns.decorator_pattern.component;

/**
 * Created by haykanush.torchyan on 11/24/2014.
 */
public abstract class CarTunning {

    private StringBuilder spares;//запчасти

    public abstract void tune();

    public StringBuilder getSpares() {
        if(this.spares==null){
            this.spares = new StringBuilder("");
        }
        return spares;
    }

    public void setSpares(StringBuilder spares) {
        this.spares = spares;
    }

    public void printTunnedSpares(){
        System.out.println(getSpares().toString());
    }
}
