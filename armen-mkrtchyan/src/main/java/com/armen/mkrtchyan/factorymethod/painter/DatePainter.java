package com.armen.mkrtchyan.factorymethod.painter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public class DatePainter implements Painter<Date> {
    @Override
    public String paint(Date object) {
        return new SimpleDateFormat().format(object);
    }
}
