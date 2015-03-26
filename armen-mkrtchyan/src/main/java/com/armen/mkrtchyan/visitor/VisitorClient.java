package com.armen.mkrtchyan.visitor;

import com.armen.mkrtchyan.visitor.impl.otherType.DateOtherTypeVisitable;
import com.armen.mkrtchyan.visitor.impl.otherType.IntegerOtherTypeVisitable;
import com.armen.mkrtchyan.visitor.impl.otherType.OtherFormatterVisitor;
import com.armen.mkrtchyan.visitor.impl.otherType.SomeOtherTypeVisitable;
import com.armen.mkrtchyan.visitor.impl.someType.DateTypeVisitable;
import com.armen.mkrtchyan.visitor.impl.someType.FormatterVisitor;
import com.armen.mkrtchyan.visitor.impl.someType.IntegerTypeVisitable;
import com.armen.mkrtchyan.visitor.impl.someType.SomeTypeVisitable;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class VisitorClient {


    private static final List<SomeOtherTypeVisitable> someOtherTypeVisitables = Arrays.asList(
            new IntegerOtherTypeVisitable(10000000),
            new DateOtherTypeVisitable(LocalDate.now())
    );

    private static final List<SomeTypeVisitable> someTypeVisitables = Arrays.asList(
            new IntegerTypeVisitable(110000000),
            new DateTypeVisitable(LocalDate.now())
    );

    public static void main(String[] args) {
        OtherFormatterVisitor otherFormatterVisitor = new OtherFormatterVisitor();
        someOtherTypeVisitables.forEach(v -> v.accept(otherFormatterVisitor));
        FormatterVisitor formatterVisitor = new FormatterVisitor();
        someTypeVisitables.forEach(v -> v.accept(formatterVisitor));
    }

}
