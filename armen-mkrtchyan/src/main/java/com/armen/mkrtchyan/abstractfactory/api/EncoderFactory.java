package com.armen.mkrtchyan.abstractfactory.api;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public interface EncoderFactory {

    Decoder createDecoder();

    Encoder createEncoder();

}
