package designpattern;

import designpattern.touritems.*;
import designpattern.visitor.DisplayTourContentVisitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sony on 3/29/2015.
 */
public class Main {
    public static void main(String... args) {
        List<TourPacketItem> tours = new LinkedList<TourPacketItem>();

        // packet 1
        int days = 10;
        tours.add(new Hotel(days, 40));

        // packet 2
        days = 7;
        tours.add(new CustomPackage(new TourPacketItem[]{new Hotel(days, 50), new Car(days, 30), new Food(days, 10)}));

        // packet 3
        days = 14;
        tours.add(new CustomPackage(new TourPacketItem[]{new Car(days, 30), new Food(days, 8)}));

        // creating visitor
        DisplayTourContentVisitor displayTourContentVisitor = new DisplayTourContentVisitor();

        // print packets contents
        for (TourPacketItem tour : tours) {
            tour.accept(displayTourContentVisitor);
            System.out.println();
        }
    }
}
