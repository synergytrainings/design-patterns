package com.armen.mkrtchyan.visitor.impl.otherType;

import java.time.LocalDate;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class DateOtherTypeVisitable
        implements SomeOtherTypeVisitable {

    private final LocalDate value;

    public DateOtherTypeVisitable(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }

    @Override
    public void accept(SomeOtherTypeVisitor visitor) {
        visitor.visit(this);
    }

}
