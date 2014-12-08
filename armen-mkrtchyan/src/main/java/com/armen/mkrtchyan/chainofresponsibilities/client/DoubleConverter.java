package com.armen.mkrtchyan.chainofresponsibilities.client;

import com.armen.mkrtchyan.chainofresponsibilities.api.AbstractConverter;
import com.armen.mkrtchyan.chainofresponsibilities.api.Converter;
import com.armen.mkrtchyan.chainofresponsibilities.api.ConvertibleValueHolder;

import java.util.regex.Pattern;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class DoubleConverter extends AbstractConverter {

    private static final Pattern DOUBLE_PATTERN = Pattern.compile("\\d+\\.\\d+");

    protected DoubleConverter(Converter nextConverter) {
        super(nextConverter);
    }


    @Override
    protected boolean canConvert(ConvertibleValueHolder holder) {
        return DOUBLE_PATTERN.matcher(holder.getConvertibleValue()).matches();
    }

    @Override
    protected void handleConvert(ConvertibleValueHolder holder) {
        holder.setConvertedValue(Double.valueOf(holder.getConvertibleValue()));
    }
}
