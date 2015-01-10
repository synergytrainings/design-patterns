package com.synisys.training.patterns.interpreter;

import com.synisys.training.patterns.interpreter.parser.EvaluationException;
import com.synisys.training.patterns.interpreter.parser.ExpressionNode;
import com.synisys.training.patterns.interpreter.parser.Parser;
import com.synisys.training.patterns.interpreter.parser.ParserException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class TestExpression {

	private final Logger logger = LoggerFactory.getLogger(TestExpression.class);

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
			logger.error(e.getMessage(), e);
			fail(e.getMessage());
		}

	}

	@Test
	public void testSin() {

		String arithmeticalExpression = "2*(1+sin(pi/2))^2";
		Parser parser = new Parser();
		try {

			//compile expression.
			ExpressionNode expression = parser.parse(arithmeticalExpression);
			ExpressionInterpreter interpreter = new ExpressionInterpreter();
			assertEquals(true, interpreter.validate(expression));

			Context context = new Context();
			context.mapVariable("pi", Math.PI);


			assertEquals(8, interpreter.interpret(expression, context), 0);

		} catch (ParserException | EvaluationException e) {
			logger.error(e.getMessage(), e);
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
			logger.error(e.getMessage(), e);
			fail(e.getMessage());
		}
	}



}