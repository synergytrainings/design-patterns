package com.synisys.training.patterns.interpreter;


import com.synisys.training.patterns.interpreter.parser.*;

import java.util.Map;

public class ExpressionInterpreter {


	public double interpret(ExpressionNode expression, Context context) {
		expression.accept(new VariableResolver(context.getValues()));
		return expression.getValue();
	}


	public boolean validate(ExpressionNode expression) {
		ValidatorVisitor visitor = new ValidatorVisitor();
		expression.accept(visitor);
		return visitor.isValid;
	}

	class ValidatorVisitor implements ExpressionNodeVisitor {

		boolean isValid = true;

		/**
		 * Validate divide by 0 case.
		 */
		@Override
		public void visit(MultiplicationExpressionNode node) {
			for (SequenceExpressionNode.Term term : node.getTerms()) {
				if (!term.positive && term.expression.getType() == ExpressionNode.CONSTANT_NODE) {
					Double value = ((ConstantExpressionNode) term.expression).getValue();
					if (value == 0) {
						isValid = false;
						break;
					}

				}
			}
		}

		/**
		 * Do nothing
		 */
		@Override
		public void visit(VariableExpressionNode node) {}

		/**
		 * Do nothing
		 */
		@Override
		public void visit(ConstantExpressionNode node) {}

		/**
		 * Do nothing
		 */
		@Override
		public void visit(AdditionExpressionNode node) {}

		/**
		 * Do nothing
		 */
		@Override
		public void visit(ExponentiationExpressionNode node) {}

		/**
		 * Do nothing
		 */
		@Override
		public void visit(FunctionExpressionNode node) {}
	}


	/**
	 * A visitor that sets a variable with a specific name to a given value
	 */
	class VariableResolver implements ExpressionNodeVisitor {

		private final Map<String, Double> variableValues;

		public VariableResolver(Map<String, Double> variableValues) {
			this.variableValues = variableValues;
		}

		/**
		 * Checks the nodes name against the name to set and sets the value.
		 */
		public void visit(VariableExpressionNode node) {
			Double value = variableValues.get(node.getName());
			if (value != null)
				node.setValue(value);
		}

		/**
		 * Do nothing
		 */
		public void visit(ConstantExpressionNode node) {}

		/**
		 * Do nothing
		 */
		public void visit(AdditionExpressionNode node) {}

		/**
		 * Do nothing
		 */
		public void visit(MultiplicationExpressionNode node) {}

		/**
		 * Do nothing
		 */
		public void visit(ExponentiationExpressionNode node) {}

		/**
		 * Do nothing
		 */
		public void visit(FunctionExpressionNode node) {}

	}
}
