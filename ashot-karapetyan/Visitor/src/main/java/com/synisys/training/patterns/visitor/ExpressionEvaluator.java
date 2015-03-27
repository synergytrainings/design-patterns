package com.synisys.training.patterns.visitor;

import com.synisys.training.patterns.parser.*;

import java.util.Map;

/**
 * A visitor that sets a variable with a specific name to a given value
 */
public class ExpressionEvaluator extends AbstractVisitor<Double> {

	private final Map<String, Double> variableValues;

	private double result = 0;

	public ExpressionEvaluator(Map<String, Double> variableValues) {
		this.variableValues = variableValues;
	}

	/**
	 * Checks the nodes name against the name to set and sets the value.
	 */
	public NodeVisitorResult<Double> visit(VariableExpressionNode node) {
		Double value = variableValues.get(node.getName());
		return new NodeVisitorResultImpl<>(value, NodeVisitorResult.ResultStatus.CONTINUE);
	}

	/**
	 * Do nothing
	 */
	public NodeVisitorResult<Double> visit(ConstantExpressionNode node) {
		return new NodeVisitorResultImpl<>(node.getValue(), NodeVisitorResult.ResultStatus.CONTINUE);
	}

	/**
	 * Do nothing
	 */
	public NodeVisitorResult<Double> visit(AdditionExpressionNode node) {
		double sum = 0d;
		for(SequenceExpressionNode.Term term : node.getTerms()){
			Double value = (Double) term.expression.accept(this).getValue();
			if (term.positive) {
				sum += value ;
			}
			else{
				sum -= value;
			}
		}
		return new NodeVisitorResultImpl<>(sum, NodeVisitorResult.ResultStatus.CONTINUE);
	}

	/**
	 * Do nothing
	 */
	public NodeVisitorResult<Double> visit(MultiplicationExpressionNode node) {
		double prod = 1.0;
		for (SequenceExpressionNode.Term term : node.getTerms()) {
			Double value = (Double) term.expression.accept(this).getValue();
			if (term.positive) {
				prod *= value;
			}
			else {
				prod /= value;
			}
		}
		return new NodeVisitorResultImpl<>(prod, NodeVisitorResult.ResultStatus.CONTINUE);
	}

	/**
	 * Do nothing
	 */
	public NodeVisitorResult<Double> visit(ExponentiationExpressionNode node) {
		Double base = (Double) node.getBase().accept(this).getValue();
		Double exponent = (Double) node.getExponent().accept(this).getValue();
		return new NodeVisitorResultImpl<>(Math.pow(base, exponent), NodeVisitorResult.ResultStatus.CONTINUE);
	}

	/**
	 * Do nothing
	 */
	public NodeVisitorResult<Double> visit(FunctionExpressionNode node) {
		//not implemented
		return new NodeVisitorResultImpl<>(0d, NodeVisitorResult.ResultStatus.CONTINUE);
	}

}