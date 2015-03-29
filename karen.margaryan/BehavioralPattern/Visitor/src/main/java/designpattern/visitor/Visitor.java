package designpattern.visitor;

import designpattern.touritems.*;

/**
 * Created by Sony on 3/29/2015.
 */

public interface Visitor<T> {
    public void visit(Car visitor);

    public void visit(Food visitor);

    public void visit(Hotel visitor);

    public void visit(CustomPackage visitor);
}
