package com.synisys.design_patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by haykanush.torchyan on 11/7/2014.
 */
public class MultilingualValuePrototype {

    private static MultilingualValuePrototype instance;

    private Map<Integer, MultilingualValue> messagesMap = new HashMap<Integer, MultilingualValue>();

    public static MultilingualValuePrototype getInstance(){
        if(instance==null){
            instance = new MultilingualValuePrototype();
        }
        return instance;
    }

    public MultilingualValue getMessage(Integer messageId){
        return this.messagesMap.get(Objects.requireNonNull(messageId));
    }

    public void putMessage(Integer messageId, MultilingualValue ml){
        this.messagesMap.put(Objects.requireNonNull(messageId), Objects.requireNonNull(ml));
    }

    public boolean containsKey(Integer messageId){
        return this.messagesMap.containsKey(Objects.requireNonNull(messageId));
    }
}
