package com.armen.mkrtchyan.interpreter.places;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 18, 2014</pre>
 */
public abstract class Place {

    private final String name;

    public Place(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Place place = (Place) o;

        if (!name.equals(place.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
