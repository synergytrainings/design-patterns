package com.armen.mkrtchyan.visitor.impl.otherType;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class OtherFormatterVisitor implements SomeOtherTypeVisitor {
    @Override
    public void visit(IntegerOtherTypeVisitable integerTypeVisitable) {
        System.out.println(DecimalFormat.getInstance(Locale.GERMAN).format(integerTypeVisitable.getValue()));
    }

    @Override
    public void visit(DateOtherTypeVisitable dateTypeVisitable) {
        System.out.println(dateTypeVisitable.getValue().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));
    }


}
