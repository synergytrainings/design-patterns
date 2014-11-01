package com.armen.mkrtchyan.abstractfactory.hex;

import com.armen.mkrtchyan.abstractfactory.Utils;
import com.armen.mkrtchyan.abstractfactory.api.Decoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public class HexDecoder implements Decoder {
    @Override
    public Object decode(InputStream stream) throws DecoderException {
        try {
            char[] encoded = IOUtils.toCharArray(stream);
            return Utils.deSerializeObject(new ByteArrayInputStream(Hex.decodeHex(encoded)));
        } catch (ClassNotFoundException | IOException e) {
            throw new DecoderException(e);
        }
    }
}
