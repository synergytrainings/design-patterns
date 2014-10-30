package com.armen.mkrtchyan.abstractfactory.api;

import org.apache.commons.codec.DecoderException;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public interface Decoder {

    Object decode(InputStream stream) throws DecoderException;

}
