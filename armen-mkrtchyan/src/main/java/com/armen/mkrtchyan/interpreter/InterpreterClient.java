package com.armen.mkrtchyan.interpreter;

import com.armen.mkrtchyan.interpreter.places.Place;
import com.armen.mkrtchyan.interpreter.places.PlaceType;
import com.armen.mkrtchyan.interpreter.places.PlaceTypeExpression;
import com.armen.mkrtchyan.interpreter.places.PlacesContext;

import java.util.Scanner;
import java.util.Set;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 18, 2014</pre>
 */
public class InterpreterClient {

    //sample query 'hotels near ACBA' or 'banks near Marriot' or 'find banks near Marriot'
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Place> places = new PlaceTypeExpression(init())
                                        .interpret(
                                                new QueryParser().parse(scanner.nextLine())
                                        );
        System.out.println(places);
    }

    public static PlacesContext init() {
        PlacesContext context = new PlacesContext();
        context.addDistance(PlaceType.BANK.create("Ameria"), PlaceType.HOTEL.create("Marriot"), 200);
        context.addDistance(PlaceType.BANK.create("ACBA"), PlaceType.BANK.create("Ameria"), 50);
        context.addDistance(PlaceType.BANK.create("ACBA"), PlaceType.HOTEL.create("Marriot"), 100);
        context.addDistance(PlaceType.BANK.create("ACBA"), PlaceType.BANK.create("HSBC"), 150);
        context.addDistance(PlaceType.BANK.create("HSBC"), PlaceType.HOTEL.create("Marriot"), 50);
        context.addDistance(PlaceType.BANK.create("HSBC"), PlaceType.BANK.create("Ameria"), 150);
        return context;
    }

}
