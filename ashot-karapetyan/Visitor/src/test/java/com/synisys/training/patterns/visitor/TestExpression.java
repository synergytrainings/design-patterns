package com.synisys.training.patterns.visitor;


import com.synisys.training.patterns.Context;
import com.synisys.training.patterns.ExpressionInterpreter;
import com.synisys.training.patterns.parser.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class TestExpression {


	@Test
	public void testMultipleInterpretation() {

		String arithmeticalExpression = "(a+b)^2";
		Parser parser = new Parser();
		try {

			//compile expression.
			ExpressionNode expression = parser.parse(arithmeticalExpression);
			ExpressionInterpreter interpreter = new ExpressionInterpreter();
			assertEquals(true, interpreter.validate(expression));

			//create context
			Context context = new Context();
			context.mapVariable("a", 3);
			context.mapVariable("b", 4);

			assertEquals(49, interpreter.interpret(expression, context), 0);

			//another context for same expression
			context = new Context();
			context.mapVariable("a", 10);
			context.mapVariable("b", 6);
			assertEquals(256, interpreter.interpret(expression, context), 0);

		} catch (ParserException | EvaluationException e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testInvalidExpression() {

		String arithmeticalExpression = "sin(a^2+b/0)*c";//divide by zero
		Parser parser = new Parser();
		try {

			//compile expression.
			ExpressionNode expression = parser.parse(arithmeticalExpression);
			ExpressionInterpreter interpreter = new ExpressionInterpreter();
			assertEquals(false, interpreter.validate(expression));

		} catch (ParserException | EvaluationException e) {
			fail(e.getMessage());
		}
	}


}