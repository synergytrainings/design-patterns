package com.armen.mkrtchyan.interpreter.places;

import java.util.Queue;
import java.util.Set;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 18, 2014</pre>
 */
public abstract class AbstractPlaceExpression {

    private final PlacesContext context;

    public AbstractPlaceExpression(PlacesContext context) {
        this.context = context;
    }

    protected PlacesContext getContext() {
        return context;
    }

    public abstract Set<Place> interpret(Queue<String> query);
}
