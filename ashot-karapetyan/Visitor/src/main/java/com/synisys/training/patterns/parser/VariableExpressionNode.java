package com.synisys.training.patterns.parser;

/**
 * An ExpressionNode that stores a named variable
 */
public class VariableExpressionNode implements ExpressionNode {
	/**
	 * The name of the variable
	 */
	private String name;

	/**
	 * Construct with the name of the variable.
	 *
	 * @param name the name of the variable
	 */
	public VariableExpressionNode(String name) {
		this.name = name;
	}

	/**
	 * @return the name of the variable
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the type of the node, in this case ExpressionNode.VARIABLE_NODE
	 */
	public int getType() {
		return VARIABLE_NODE;
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
