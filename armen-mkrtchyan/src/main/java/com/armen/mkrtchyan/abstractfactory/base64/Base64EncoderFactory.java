package com.armen.mkrtchyan.abstractfactory.base64;

import com.armen.mkrtchyan.abstractfactory.api.EncoderFactory;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public class Base64EncoderFactory implements EncoderFactory {
    @Override
    public Base64Decoder createDecoder() {
        return new Base64Decoder();
    }

    @Override
    public Base64Encoder createEncoder() {
        return new Base64Encoder();
    }
}
