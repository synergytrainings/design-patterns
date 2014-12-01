package com.armen.mkrtchyan.flyweight.route;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class RouteContext {

    private int currentLongitude = 0;
    private int currentLatitude = 0;

    public int getCurrentLongitude() {
        return currentLongitude;
    }

    public void setCurrentLongitude(int currentLongitude) {
        this.currentLongitude = currentLongitude;
    }

    public int getCurrentLatitude() {
        return currentLatitude;
    }

    public void setCurrentLatitude(int currentLatitude) {
        this.currentLatitude = currentLatitude;
    }
}
