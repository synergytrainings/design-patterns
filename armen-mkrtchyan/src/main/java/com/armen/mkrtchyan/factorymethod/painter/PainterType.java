package com.armen.mkrtchyan.factorymethod.painter;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public enum PainterType implements PainterFactory{
    DATE {
        @Override
        public DatePainter createPainter() {
            return new DatePainter();
        }
    }, INTEGER {
        @Override
        public NumberPainter createPainter() {
            return new NumberPainter();
        }
    };

    public static PainterType findType(String type) {
        return valueOf(type.toUpperCase());
    }
}
