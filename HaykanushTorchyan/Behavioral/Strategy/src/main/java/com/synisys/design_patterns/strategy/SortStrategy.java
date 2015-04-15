package com.synisys.design_patterns.strategy;

import com.sun.javafx.beans.annotations.NonNull;
import com.synisys.design_patterns.strategy.entity.Student;

/**
 * Created by haykanush.torchyan on 4/15/2015.
 */
public abstract class SortStrategy {

    public abstract int compare(@NonNull Student st1, @NonNull Student st2);
    
}
