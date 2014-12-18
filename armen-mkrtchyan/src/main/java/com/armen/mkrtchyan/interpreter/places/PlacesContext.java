package com.armen.mkrtchyan.interpreter.places;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.List;
import java.util.Map;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 18, 2014</pre>
 */
public class PlacesContext {

    private final Table<Place, Place, Integer> distanceGraph = HashBasedTable.create();

    public void addDistance(Place from, Place to, Integer distance) {
        distanceGraph.put(from, to, distance);
        distanceGraph.put(to, from, distance);
    }

    public Map<Place, Integer> distancesTo(Place place) {
        return distanceGraph.row(place);
    }

}
