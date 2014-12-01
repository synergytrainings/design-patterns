package com.armen.mkrtchyan.flyweight.route;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class CrossroadImpl implements Crossroad {

    private final int longitude;

    private final int latitude;

    private Crossroad nextCrossRoad;

    CrossroadImpl(int longitude, int latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public Integer getLongitude() {
        return longitude;
    }

    @Override
    public Integer getLatitude() {
        return latitude;
    }

    @Override
    public Crossroad setNextCrossroad(Crossroad crossroad) {
        this.nextCrossRoad = crossroad;
        return nextCrossRoad;
    }

    @Override
    public void draw(RouteContext context) {
        if (context.getCurrentLatitude() > latitude) {
            System.out.println("up");
            context.setCurrentLatitude(latitude);
            delegateDraw(context);
            return;
        } else if (context.getCurrentLatitude() < latitude) {
            System.out.println("down");
            context.setCurrentLatitude(latitude);
            delegateDraw(context);
            return;
        } else if (context.getCurrentLongitude() < longitude) {
            System.out.println("right");
            context.setCurrentLongitude(longitude);
            delegateDraw(context);
            return;
        }
        throw new IllegalStateException("wrong coordinates of crossroads");
    }

    private void delegateDraw(RouteContext context) {
        if (nextCrossRoad != null) {
            nextCrossRoad.draw(context);
        }
    }

}
