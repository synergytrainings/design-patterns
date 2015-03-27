package com.synisys.training.patterns.parser;

/**
 * An ExpressionNode that stores a constant value
 */
public class ConstantExpressionNode implements ExpressionNode {
	/**
	 * The value of the constant
	 */
	private double value;

	/**
	 * Construct with the fixed value.
	 *
	 * @param value the value of the constant
	 */
	public ConstantExpressionNode(double value) {
		this.value = value;
	}

	/**
	 * Convenience constructor that takes a string and converts it to a double
	 * before storing the value.
	 *
	 * @param value the string representation of the value
	 */
	public ConstantExpressionNode(String value) {
		this.value = Double.valueOf(value);
	}

	/**
	 * Returns the value of the constant
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Returns the type of the node, in this case ExpressionNode.CONSTANT_NODE
	 */
	public int getType() {
		return CONSTANT_NODE;
	}

	/**
	 * Implementation of the visitor design pattern.
	 * <p/>
	 * Calls visit on the visitor.
	 *
	 * @param visitor the visitor
	 */
	public NodeVisitorResult accept(ExpressionNodeVisitor visitor) {
		return visitor.visit(this);
	}
}
