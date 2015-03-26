package com.armen.mkrtchyan.visitor.impl.someType;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class IntegerTypeVisitable implements SomeTypeVisitable {

    private final Integer value;

    public IntegerTypeVisitable(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public void accept(SomeTypeVisitor visitor) {
        visitor.visit(this);
    }
}
