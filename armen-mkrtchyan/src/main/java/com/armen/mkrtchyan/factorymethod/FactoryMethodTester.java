package com.armen.mkrtchyan.factorymethod;

import com.armen.mkrtchyan.factorymethod.painter.PainterType;

import java.util.Date;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public class FactoryMethodTester {

    public static void main(String[] args) {
        System.out.println(PainterType.findType("date").createPainter().paint(new Date()));
        System.out.println(PainterType.findType("integer").createPainter().paint(17845641));
    }

}
