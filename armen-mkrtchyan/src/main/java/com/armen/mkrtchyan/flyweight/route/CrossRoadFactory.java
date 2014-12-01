package com.armen.mkrtchyan.flyweight.route;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class CrossroadFactory {

    private static final Table<Integer, Integer, Crossroad> availableCrossroads = HashBasedTable.create(5, 5);

    public static Crossroad create(int longitude, int latitude) {
        checkCoordinates(longitude, latitude);
        if (!availableCrossroads.contains(longitude, latitude)) {
            availableCrossroads.put(longitude, latitude, new CrossroadImpl(longitude, latitude));
        }
        return availableCrossroads.get(longitude, latitude);
    }

    private static void checkCoordinates(int longitude, int latitude) {
        if (longitude > 5 || longitude < 0) {
            throw new IllegalArgumentException("longitude must be between 0 and 5 given longitude is " + longitude);
        } else if (latitude > 5 || latitude < 0) {
            throw new IllegalArgumentException("latitude must be between 0 and 5 given latitude is " + latitude);
        }
    }

}
