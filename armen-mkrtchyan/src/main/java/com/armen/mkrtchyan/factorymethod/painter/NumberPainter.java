package com.armen.mkrtchyan.factorymethod.painter;

import java.text.DecimalFormat;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public class NumberPainter implements Painter<Integer>{

    @Override
    public String paint(Integer object) {
        return new DecimalFormat().format(object);
    }
}
