package com.synisys.training.patterns;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Context {

	Map<String, Double> variableValues = new HashMap<>();

	public void mapVariable(String variableName, double value) {
		this.variableValues.put(variableName, value);
	}

	public Map<String, Double>  getValues() {
		return Collections.unmodifiableMap(this.variableValues);
	}


}
