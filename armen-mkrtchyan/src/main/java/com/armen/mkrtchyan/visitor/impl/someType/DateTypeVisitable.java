package com.armen.mkrtchyan.visitor.impl.someType;

import java.time.LocalDate;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class DateTypeVisitable implements SomeTypeVisitable {

    private final LocalDate value;

    public DateTypeVisitable(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }

    @Override
    public void accept(SomeTypeVisitor visitor) {
        visitor.visit(this);
    }

}
