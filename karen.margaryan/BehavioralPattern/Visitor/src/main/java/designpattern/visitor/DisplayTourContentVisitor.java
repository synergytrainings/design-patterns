package designpattern.visitor;

import designpattern.touritems.*;

/**
 * Created by Sony on 3/29/2015.
 */
public class DisplayTourContentVisitor implements Visitor {

    public void visit(Car car) {
        int days = car.getDays();
        double dailyPrice = car.getPricePerDay();
        double totalPrice = days * dailyPrice;
        System.out.println(String.format("Car [days=%d, price=%f, total=%f]", days, dailyPrice, totalPrice));
    }

    public void visit(CustomPackage customPackage) {
        System.out.println("Custom packet");
    }

    public void visit(Food food) {
        int days = food.getDays();
        double dailyPrice = food.getPricePerDay();
        double totalPrice = days * dailyPrice;
        System.out.println(String.format("Food [days=%d, price=%f, total=%f]", days, dailyPrice, totalPrice));
    }

    public void visit(Hotel hotel) {
        int days = hotel.getDays();
        double dailyPrice = hotel.getPricePerDay();
        double totalPrice = days * dailyPrice;
        System.out.println(String.format("Hotel [days=%d, price=%f, total=%f]", days, dailyPrice, totalPrice));
    }

}
