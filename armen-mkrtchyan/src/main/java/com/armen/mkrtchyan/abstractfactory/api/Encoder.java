package com.armen.mkrtchyan.abstractfactory.api;

import java.io.OutputStream;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public interface Encoder {

    byte[] encode(Object toEncode);

}
