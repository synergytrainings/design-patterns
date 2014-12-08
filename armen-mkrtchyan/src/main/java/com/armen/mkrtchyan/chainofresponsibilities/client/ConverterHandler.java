package com.armen.mkrtchyan.chainofresponsibilities.client;

import com.armen.mkrtchyan.chainofresponsibilities.api.Converter;
import com.armen.mkrtchyan.chainofresponsibilities.api.ConvertibleValueHolder;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class ConverterHandler {

    private Converter peekConverter;

    public void addConverterOfType(ConverterType type) {
        peekConverter = type.createConverter(peekConverter);
    }

    public void handleConvert(ConvertibleValueHolder holder) {
        peekConverter.convert(holder);
    }

}
