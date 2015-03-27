package com.synisys.training.patterns.parser;

/**
 * An interface for the visitor design pattern.
 * <p/>
 * Expression nodes can be visited by ExpressionNodeVisitor by calling their
 * accept methods. The expression nodes, in turn, call the appropriate visit
 * method of the expression node visitor.
 */
public interface ExpressionNodeVisitor<T> {
	/**
	 * Visit a VariableExpressionNode
	 */
	public NodeVisitorResult<T> visit(VariableExpressionNode node);

	/**
	 * Visit a ConstantExpressionNode
	 */
	public NodeVisitorResult<T> visit(ConstantExpressionNode node);

	/**
	 * Visit a AdditionExpressionNode
	 */
	public NodeVisitorResult<T> visit(AdditionExpressionNode node);

	/**
	 * Visit a MultiplicationExpressionNode
	 */
	public NodeVisitorResult<T> visit(MultiplicationExpressionNode node);

	/**
	 * Visit a ExponentiationExpressionNode
	 */
	public NodeVisitorResult<T> visit(ExponentiationExpressionNode node);

	/**
	 * Visit a FunctionExpressionNode
	 */
	public NodeVisitorResult<T> visit(FunctionExpressionNode node);
}
