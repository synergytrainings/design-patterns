package com.synisys.design_patterns.strategy;

import com.sun.javafx.beans.annotations.NonNull;
import com.synisys.design_patterns.strategy.entity.Student;

/**
 * Created by haykanush.torchyan on 4/15/2015.
 */
public class SortById extends SortStrategy {

    private static final SortById instance = new SortById();

    private SortById(){
    }

    public static SortById getInstance(){
        return instance;
    }

    @Override
    public int compare(@NonNull Student st1, @NonNull Student st2){
        if(st1.getId()==null){
            return st2.getId()==null ? 0 : -1;
        } else {
            return st2.getId()==null ? 1 : st1.getId().compareTo(st2.getId());
        }
    }
    
}
