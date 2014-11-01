package com.armen.mkrtchyan.abstractfactory.api;

import com.armen.mkrtchyan.abstractfactory.base64.Base64EncoderFactory;
import com.armen.mkrtchyan.abstractfactory.hex.HexEncoderFactory;

/**
 * @author armen.mkrtchyan
 * @version 1.0
 * @since <pre>Nov 02, 2014</pre>
 */
public enum EncoderType {

    HEX {
        @Override
        public EncoderFactory factory() {
            return new HexEncoderFactory();
        }
    },
    BASE64 {
        @Override
        public EncoderFactory factory() {
            return new Base64EncoderFactory();
        }
    };

    public abstract EncoderFactory factory();

    public static EncoderType findType(String type) {
        return EncoderType.valueOf(type.toUpperCase());
    }

}
