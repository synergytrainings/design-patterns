package com.armen.mkrtchyan.chainofresponsibilities.client;

import com.armen.mkrtchyan.chainofresponsibilities.api.AbstractConverter;
import com.armen.mkrtchyan.chainofresponsibilities.api.Converter;
import com.armen.mkrtchyan.chainofresponsibilities.api.ConvertibleValueHolder;

import java.util.regex.Pattern;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class IntegerConverter extends AbstractConverter {

    private static final Pattern INTEGER_PATTERN = Pattern.compile("\\d+");

    protected IntegerConverter(Converter nextConverter) {
        super(nextConverter);
    }

    @Override
    protected boolean canConvert(ConvertibleValueHolder holder) {
        return INTEGER_PATTERN.matcher(holder.getConvertibleValue()).matches();
    }

    @Override
    protected void handleConvert(ConvertibleValueHolder holder) {
        holder.setConvertedValue(Integer.valueOf(holder.getConvertibleValue()));
    }
}
