package com.synisys.design_patterns.domain;

import java.math.BigDecimal;

/**
 * Created by haykanush.torchyan on 11/7/2014.
 */
public abstract class Motor {

    protected String type;
    protected BigDecimal volume;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }
}
