package com.armen.mkrtchyan.interpreter.places;

import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 18, 2014</pre>
 */
public class PlaceTypeExpression extends AbstractPlaceExpression {

    public PlaceTypeExpression(PlacesContext context) {
        super(context);
    }

    @Override
    public Set<Place> interpret(Queue<String> query) {
        PlaceType type = PlaceType.findType(query.poll());
        return new NearestPlaceExpression(getContext(), type).interpret(query);
    }
}
