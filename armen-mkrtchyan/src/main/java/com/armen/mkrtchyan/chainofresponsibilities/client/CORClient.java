package com.armen.mkrtchyan.chainofresponsibilities.client;

import com.armen.mkrtchyan.chainofresponsibilities.api.ConvertibleValueHolder;

import java.util.Scanner;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class CORClient {

    public static void main(String[] args) {
        ConverterHandler handler = new ConverterHandler();
        handler.addConverterOfType(ConverterType.DOUBLE);
        handler.addConverterOfType(ConverterType.INTEGER);
        handler.addConverterOfType(ConverterType.URL);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        do {
            ConvertibleValueHolder holder = new ConvertibleValueHolder(line);
            handler.handleConvert(holder);
            System.out.println(holder.getConvertedValue() + "/" + holder.getConvertedValue().getClass().getSimpleName());
            line = scanner.nextLine();
        } while (!"finish".equals(line));
    }

}
