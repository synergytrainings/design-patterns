package com.armen.mkrtchyan.abstractfactory;

import com.armen.mkrtchyan.abstractfactory.api.EncoderType;
import com.armen.mkrtchyan.abstractfactory.api.EncoderFactory;
import org.apache.commons.codec.DecoderException;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public class AbstractFactoryTester {

    public static void main(String[] args) throws IOException, DecoderException {
        TestClass testObject = new TestClass(
                1,
                "blah",
                BigDecimal.TEN,
                Arrays.asList(1, 2, 3)
        );
        EncoderFactory factory = EncoderType.findType(args[0]).factory();
        System.out.write(factory.createEncoder().encode(testObject));
    }

}
