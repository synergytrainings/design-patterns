package com.synisys.expression;

import com.synisys.interpreter.InterpreterContext;

public abstract class AbstractExpression {
	public abstract StringBuffer interpret(InterpreterContext context);
}