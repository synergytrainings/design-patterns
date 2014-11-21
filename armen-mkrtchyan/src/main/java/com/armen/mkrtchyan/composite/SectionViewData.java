package com.armen.mkrtchyan.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 21, 2014</pre>
 */
public class SectionViewData implements ModificationsViewData {

    private final String id;
    private final List<ModificationsViewData> children = new ArrayList<>();

    public SectionViewData(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean hasModifications() {
        for (ModificationsViewData child : children) {
            if (child.hasModifications()) {
                return true;
            }
        }
        return false;
    }


    public void addChild(ModificationsViewData data) {
        children.add(data);
    }
}
