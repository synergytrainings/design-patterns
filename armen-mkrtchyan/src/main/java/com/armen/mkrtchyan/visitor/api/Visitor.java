package com.armen.mkrtchyan.visitor.api;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public interface Visitor<T extends Visitor<T, V>, V extends Visitable<V, T>>{


}
