package com.synisys.design_patterns.factory;

import java.util.Map;
import java.util.Objects;

/**
 * Created by haykanush.torchyan on 11/6/2014.
 */
public class MultilingualValue {

    private Map<Integer, String> values;

    public void put(Integer languageId, String value){
        this.values.put(Objects.requireNonNull(languageId), Objects.requireNonNull(value));
    }

    public String get(Integer languageId){
        return this.values.get(Objects.requireNonNull(languageId));
    }

}
