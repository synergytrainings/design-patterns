package com.armen.mkrtchyan.interpreter.places;

import java.util.*;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 18, 2014</pre>
 */
public class NearestPlaceExpression extends AbstractPlaceExpression {

    private final PlaceType type;

    public NearestPlaceExpression(PlacesContext context, PlaceType type) {
        super(context);
        this.type = type;
    }

    @Override
    public Set<Place> interpret(Queue<String> query) {
        Set<Place> places = new HashSet<>();
        TreeMap<Integer, Place> sortedPlaces = new TreeMap<>();
        Map<Place, Integer> distancesTo = getContext().distancesTo(PlaceType.getPlaceFromName(query.poll()));
        for (Place place : distancesTo.keySet()) {
            sortedPlaces.put(distancesTo.get(place), place);
        }
        if (type == null) {
            places.add(sortedPlaces.pollFirstEntry().getValue());
            places.add(sortedPlaces.pollFirstEntry().getValue());
        } else {
            while (places.size() < 2 && !sortedPlaces.isEmpty()) {
                Place place = sortedPlaces.pollFirstEntry().getValue();
                if (type.isOfType(place)) {
                    places.add(place);
                }
            }
        }
        return places;
    }

}
