package com.armen.mkrtchyan.visitor.impl.someType;

import com.armen.mkrtchyan.visitor.impl.otherType.DateOtherTypeVisitable;
import com.armen.mkrtchyan.visitor.impl.otherType.IntegerOtherTypeVisitable;
import com.armen.mkrtchyan.visitor.impl.otherType.SomeOtherTypeVisitable;
import com.armen.mkrtchyan.visitor.impl.otherType.SomeOtherTypeVisitor;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class FormatterVisitor implements SomeTypeVisitor {
    @Override
    public void visit(IntegerTypeVisitable integerTypeVisitable) {
        System.out.println(DecimalFormat.getInstance(Locale.UK).format(integerTypeVisitable.getValue()));
    }

    @Override
    public void visit(DateTypeVisitable dateTypeVisitable) {
        System.out.println(dateTypeVisitable.getValue().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.UK)));
    }
}
