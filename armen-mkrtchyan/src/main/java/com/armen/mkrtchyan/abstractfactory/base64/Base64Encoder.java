package com.armen.mkrtchyan.abstractfactory.base64;

import com.armen.mkrtchyan.abstractfactory.Utils;
import com.armen.mkrtchyan.abstractfactory.api.Encoder;
import org.apache.commons.codec.binary.Base64;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public class Base64Encoder implements Encoder {

    Base64Encoder() {
    }

    @Override
    public byte[] encode(Object toEncode) {
        return Base64.encodeBase64(Utils.serializeObject(toEncode));
    }
}
