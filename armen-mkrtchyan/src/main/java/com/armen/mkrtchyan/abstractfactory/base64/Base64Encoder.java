package com.armen.mkrtchyan.abstractfactory.base64;

import com.armen.mkrtchyan.abstractfactory.Utils;
import com.armen.mkrtchyan.abstractfactory.api.Encoder;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public class Base64Encoder implements Encoder {
    @Override
    public byte[] encode(Object toEncode) {
        return Base64.getEncoder().encode(Utils.serializeObject(toEncode));
    }
}
