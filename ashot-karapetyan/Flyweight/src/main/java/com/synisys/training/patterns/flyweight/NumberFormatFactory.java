package com.synisys.training.patterns.flyweight;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class NumberFormatFactory {


	private final static ThreadLocal<Map<String, NumberFormat>> numberFormats = new ThreadLocal<Map<String, NumberFormat>>();

	public static NumberFormat getNumberFormat(String pattern) {
		if (numberFormats.get() == null) {
			numberFormats.set(new HashMap<String, NumberFormat>());
		}
		Map<String, NumberFormat> formats = numberFormats.get();
		if (!formats.containsKey(pattern)) {
			formats.put(pattern, new DecimalFormat(pattern));
		}
		return formats.get(pattern);
	}

}
