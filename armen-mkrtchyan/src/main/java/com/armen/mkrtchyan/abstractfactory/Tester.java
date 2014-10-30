package com.armen.mkrtchyan.abstractfactory;

import com.armen.mkrtchyan.abstractfactory.api.EncodingFactor;
import com.armen.mkrtchyan.abstractfactory.base64.Base64EncodingFactory;
import com.armen.mkrtchyan.abstractfactory.hex.HexEncodingFactory;
import org.apache.commons.codec.DecoderException;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public class Tester {

    public static void main(String[] args) throws IOException, DecoderException {
        TestClass testObject = new TestClass(
                1,
                "blah",
                BigDecimal.TEN,
                Arrays.asList(1, 2, 3)
        );
        EncodingFactor base64 = new Base64EncodingFactory();
        EncodingFactor hex = new HexEncodingFactory();
        File tempFileBase64 = File.createTempFile("base64", "ser");
        File tempFileHex = File.createTempFile("hex", "ser");
        try (FileOutputStream base64Output = new FileOutputStream(tempFileBase64);
             FileOutputStream hexOutput = new FileOutputStream(tempFileHex)) {
            base64Output.write(base64.createEncoder().encode(testObject));
            hexOutput.write(hex.createEncoder().encode(testObject));
        }
        try (FileInputStream base64Input = new FileInputStream(tempFileBase64);
             FileInputStream hexInput = new FileInputStream(tempFileHex)) {
            testObjects(testObject, base64.createDecoder().decode(base64Input));
            testObjects(testObject, hex.createDecoder().decode(hexInput));
        }
    }

    private static void testObjects(Object original, Object decoded) {
        System.out.println(original.equals(decoded));
        System.out.println(decoded);
    }

}
