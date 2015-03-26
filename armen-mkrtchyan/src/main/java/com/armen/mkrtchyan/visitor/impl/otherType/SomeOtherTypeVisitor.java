package com.armen.mkrtchyan.visitor.impl.otherType;

import com.armen.mkrtchyan.visitor.api.Visitor;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public interface SomeOtherTypeVisitor extends Visitor<SomeOtherTypeVisitor, SomeOtherTypeVisitable> {

    void visit(IntegerOtherTypeVisitable integerTypeVisitable);

    void visit(DateOtherTypeVisitable dateTypeVisitable);

}
