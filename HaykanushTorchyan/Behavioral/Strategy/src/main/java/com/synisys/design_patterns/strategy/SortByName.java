package com.synisys.design_patterns.strategy;

import com.sun.javafx.beans.annotations.NonNull;
import com.synisys.design_patterns.strategy.entity.Student;

/**
 * Created by haykanush.torchyan on 4/15/2015.
 */
public class SortByName extends SortStrategy {

    private static final SortByName instance = new SortByName();

    private SortByName(){
    }

    public static SortByName getInstance(){
        return instance;
    }


    @Override
    public int compare(@NonNull Student st1, @NonNull Student st2){
        if(st1.getName()==null){
            return st2.getName()==null ? 0 : -1;
        } else {
            return st2.getName()==null ? 1 : st1.getName().compareTo(st2.getName());
        }
    }
    
}
