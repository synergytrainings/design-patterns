package com.synisys.training.patterns.parser;

/**
 * An interface for expression nodes.
 * <p/>
 * Every concrete type of expression node has to implement this interface.
 */
public interface ExpressionNode {
	/**
	 * Node id for variable nodes
	 */
	public static final int VARIABLE_NODE = 1;
	/**
	 * Node id for constant nodes
	 */
	public static final int CONSTANT_NODE = 2;
	/**
	 * Node id for addition nodes
	 */
	public static final int ADDITION_NODE = 3;
	/**
	 * Node id for multiplication nodes
	 */
	public static final int MULTIPLICATION_NODE = 4;
	/**
	 * Node id for exponentiation nodes
	 */
	public static final int EXPONENTIATION_NODE = 5;
	/**
	 * Node id for function nodes
	 */
	public static final int FUNCTION_NODE = 6;

	/**
	 * Returns the type of the node.ExpressionNode
	 * <p/>
	 * Each class derived from ExpressionNode representing a specific
	 * role in the expression should return the type according to that
	 * role.
	 *
	 * @return type of the node
	 */
	public int getType();


	/**
	 * Method needed for the visitor design pattern
	 *
	 * @param visitor the visitor
	 */
	public <T> NodeVisitorResult<T> accept(ExpressionNodeVisitor<T> visitor);

}
