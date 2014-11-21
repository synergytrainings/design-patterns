package com.armen.mkrtchyan.composite;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 21, 2014</pre>
 */
public class FieldViewData implements ModificationsViewData {

    private final boolean isModified;
    private final String id;

    public FieldViewData(boolean isModified, String id) {
        this.isModified = isModified;
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean hasModifications() {
        return isModified;
    }

}
