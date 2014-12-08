package com.armen.mkrtchyan.chainofresponsibilities.client;

import com.armen.mkrtchyan.chainofresponsibilities.api.Converter;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public enum ConverterType {

    INTEGER {
        @Override
        public Converter createConverter(Converter child) {
            return new IntegerConverter(child);
        }
    }, DOUBLE {
        @Override
        public Converter createConverter(Converter child) {
            return new DoubleConverter(child);
        }
    }, URL {
        @Override
        public Converter createConverter(Converter child) {
            return new UrlConverter(child);
        }
    };

    public abstract Converter createConverter(Converter child);

}
