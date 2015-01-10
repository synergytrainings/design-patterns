package com.synisys.training.patterns.interpreter.parser;

/**
 * An ExpressionNode that handles exponentiation. The node holds
 * a base and an exponent and calulates base^exponent
 */
public class ExponentiationExpressionNode implements ExpressionNode {
	/**
	 * the node containing the base
	 */
	private ExpressionNode base;
	/**
	 * the node containing the exponent
	 */
	private ExpressionNode exponent;

	/**
	 * Construct the ExponentiationExpressionNode with base and exponent
	 *
	 * @param base     the node containing the base
	 * @param exponent the node containing the exponent
	 */
	public ExponentiationExpressionNode(ExpressionNode base, ExpressionNode exponent) {
		this.base = base;
		this.exponent = exponent;
	}

	/**
	 * Returns the type of the node, in this case ExpressionNode.EXPONENTIATION_NODE
	 */
	public int getType() {
		return EXPONENTIATION_NODE;
	}

	/**
	 * Returns the value of the sub-expression that is rooted at this node.
	 * <p/>
	 * Calculates base^exponent
	 */
	public double getValue() {
		return Math.pow(base.getValue(), exponent.getValue());
	}

	/**
	 * Implementation of the visitor design pattern.
	 * <p/>
	 * Calls visit on the visitor and then passes the visitor on to the accept
	 * method of the base and the exponent.
	 *
	 * @param visitor the visitor
	 */
	public void accept(ExpressionNodeVisitor visitor) {
		visitor.visit(this);
		base.accept(visitor);
		exponent.accept(visitor);
	}
}
