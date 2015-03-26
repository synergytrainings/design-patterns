package com.armen.mkrtchyan.visitor.api;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public interface Visitable<T extends Visitable<T, V>, V extends Visitor<V, T>> {

    void accept(V visitor);

}
