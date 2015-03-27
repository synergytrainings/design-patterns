package com.synisys.training.patterns;


import com.synisys.training.patterns.parser.*;
import com.synisys.training.patterns.visitor.ExpressionValidator;
import com.synisys.training.patterns.visitor.ExpressionEvaluator;

public class ExpressionInterpreter {


	public double interpret(ExpressionNode expression, Context context) {
		ExpressionEvaluator calculator = new ExpressionEvaluator(context.getValues());
		return expression.accept(calculator).getValue();
	}


	public boolean validate(ExpressionNode expression) {
		ExpressionValidator visitor = new ExpressionValidator();
		expression.accept(visitor);
		return visitor.isValid();
	}



}
