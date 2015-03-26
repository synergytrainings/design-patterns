package com.armen.mkrtchyan.visitor.impl.someType;

import com.armen.mkrtchyan.visitor.api.Visitor;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public interface SomeTypeVisitor extends Visitor<SomeTypeVisitor, SomeTypeVisitable> {

    void visit(IntegerTypeVisitable integerTypeVisitable);

    void visit(DateTypeVisitable dateTypeVisitable);

}
