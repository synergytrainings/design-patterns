package com.armen.mkrtchyan.interpreter.places;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 18, 2014</pre>
 */
public interface PlaceVisitor {

    void visit(Bank bank);

    void visit(Hotel hotel);

}
