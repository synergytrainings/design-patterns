package com.armen.mkrtchyan.factorymethod.painter;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public interface PainterFactory {

    <T> Painter<T> createPainter();

}
