package com.armen.mkrtchyan.flyweight.route;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public interface Crossroad {

    Integer getLongitude();

    Integer getLatitude();

    void draw(RouteContext context);

    Crossroad setNextCrossroad(Crossroad crossroad);
}
