package com.armen.mkrtchyan.flyweight;

import com.armen.mkrtchyan.flyweight.route.CrossroadFactory;
import com.armen.mkrtchyan.flyweight.route.Crossroad;
import com.armen.mkrtchyan.flyweight.route.RouteContext;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class FlyweightClient {

    public static void main(String[] args) {
        Crossroad crossroad = init();
        crossroad.draw(new RouteContext());
    }

    private static Crossroad init() {
        Crossroad currentCrossroad = CrossroadFactory.create(0, 1);
        currentCrossroad.setNextCrossroad(CrossroadFactory.create(0, 2))
                        .setNextCrossroad(CrossroadFactory.create(1, 2))
                        .setNextCrossroad(CrossroadFactory.create(1, 3))
                        .setNextCrossroad(CrossroadFactory.create(1, 4));
        return currentCrossroad;
    }

}
