package designpattern.touritems;

import designpattern.visitor.Visitor;

/**
 * Created by Karen Margaryan on 3/29/2015.
 */
public class Food implements TourPacketItem {

    private int days;
    private double pricePerDay;

    public Food(int days, double pricePerDay) {
        this.days = days;
        this.pricePerDay = pricePerDay;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getDays() {
        return days;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }
}
