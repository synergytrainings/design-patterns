package com.armen.mkrtchyan.abstractfactory.base64;

import com.armen.mkrtchyan.abstractfactory.Utils;
import com.armen.mkrtchyan.abstractfactory.api.Decoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public class Base64Decoder implements Decoder {

    Base64Decoder() {
    }

    @Override
    public Object decode(InputStream stream) throws DecoderException{
        byte[] encoded;
        try {
            encoded = IOUtils.toByteArray(stream);
        } catch (IOException e) {
            throw new DecoderException(e);
        }
        try {
            return Utils.deSerializeObject(new ByteArrayInputStream(Base64.decodeBase64(encoded)));
        } catch (IOException | ClassNotFoundException e) {
            throw new DecoderException(e);
        }
    }
}
