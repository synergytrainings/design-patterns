package com.synisys.expression;

import java.util.ArrayList;

import com.synisys.entity.Car;
import com.synisys.interpreter.InterpreterContext;

public class CarModelExpression extends AbstractExpression {

	private String searchString;

	public CarModelExpression(String searchString) {
		this.searchString = searchString;
	}

	public StringBuffer interpret(InterpreterContext context) {
		ArrayList<Car> cars = context.getAllCars();
		StringBuffer result = new StringBuffer();
		for (Car car : cars) {
			if (car.getModel().equalsIgnoreCase(searchString)) {
				result.append(car.toString() + "\n");
			}
		}
		return result;

	}

}