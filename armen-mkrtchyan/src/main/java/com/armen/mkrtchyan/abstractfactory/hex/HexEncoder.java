package com.armen.mkrtchyan.abstractfactory.hex;

import com.armen.mkrtchyan.abstractfactory.Utils;
import com.armen.mkrtchyan.abstractfactory.api.Encoder;
import org.apache.commons.codec.binary.Hex;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public class HexEncoder implements Encoder {
    @Override
    public byte[] encode(Object toEncode) {
        return Hex.encodeHexString(Utils.serializeObject(toEncode)).getBytes();
    }
}
