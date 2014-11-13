package com.synisys.training.patterns.structural.adapter;

import com.sun.javafx.scene.layout.region.Margins;

import java.util.List;

/**
 * Client class demonstrating Adapter pattern
 * Something like JSF converter
 *
 * @author Anania.Mikaelyan
 * @since 11/13/2014
 */
public class ClassifierConverter {
    private final List<Classifier> selectItems;

    public ClassifierConverter(List<Classifier> selectItems) {
        this.selectItems = selectItems;
    }

    public String getAsString(Classifier selectItem) {
        return selectItem.getName();
    }

    public Classifier getAsObject(String classifierId) {
        for (Classifier selectItem : selectItems) {
            if(selectItem.getId().equals(classifierId)){
                return selectItem;
            }
        }
        return null;
    }
}
