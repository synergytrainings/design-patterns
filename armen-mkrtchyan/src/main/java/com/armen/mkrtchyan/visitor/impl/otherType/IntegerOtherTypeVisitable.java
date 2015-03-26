package com.armen.mkrtchyan.visitor.impl.otherType;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class IntegerOtherTypeVisitable
        implements SomeOtherTypeVisitable {

    private final Integer value;

    public IntegerOtherTypeVisitable(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public void accept(SomeOtherTypeVisitor visitor) {
        visitor.visit(this);
    }
}
