package com.armen.mkrtchyan.abstractfactory.hex;

import com.armen.mkrtchyan.abstractfactory.api.EncodingFactor;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public class HexEncodingFactory implements EncodingFactor {
    @Override
    public HexDecoder createDecoder() {
        return new HexDecoder();
    }

    @Override
    public HexEncoder createEncoder() {
        return new HexEncoder();
    }
}
