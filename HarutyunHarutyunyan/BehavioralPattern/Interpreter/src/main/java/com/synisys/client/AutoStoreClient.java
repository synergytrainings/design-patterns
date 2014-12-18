package com.synisys.client;

import com.synisys.entity.CarProperty;
import com.synisys.expression.AbstractExpression;
import com.synisys.expression.CarModelExpression;
import com.synisys.expression.CarYearExpression;
import com.synisys.interpreter.InterpreterContext;


public class AutoStoreClient {
	public StringBuffer interpret(InterpreterContext context, CarProperty property, String expression) {
		AbstractExpression exp = null;

		if (property.equals(CarProperty.Model)) {
			exp = new CarModelExpression(expression);
		}
		if (property.equals(CarProperty.Year)) {
			exp = new CarYearExpression(expression);
		}

		return exp != null ? exp.interpret(context) : null;

	}

	public static void main(String[] args) {
		InterpreterContext context = new InterpreterContext("http://auto.am/");
		AutoStoreClient client = new AutoStoreClient();

		StringBuffer result = client.interpret(context, CarProperty.Model, "ToyotaPrado");
		System.out.println(result);

		result = client.interpret(context, CarProperty.Year, "2008");
		System.out.println(result);
	}
}
