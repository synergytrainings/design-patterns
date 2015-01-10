package com.synisys.training.patterns.interpreter.parser;

/**
 * An interface for the visitor design pattern.
 * <p/>
 * Expression nodes can be visited by ExpressionNodeVisitor by calling their
 * accept methods. The expression nodes, in turn, call the appropriate visit
 * method of the expression node visitor.
 */
public interface ExpressionNodeVisitor {
	/**
	 * Visit a VariableExpressionNode
	 */
	public void visit(VariableExpressionNode node);

	/**
	 * Visit a ConstantExpressionNode
	 */
	public void visit(ConstantExpressionNode node);

	/**
	 * Visit a AdditionExpressionNode
	 */
	public void visit(AdditionExpressionNode node);

	/**
	 * Visit a MultiplicationExpressionNode
	 */
	public void visit(MultiplicationExpressionNode node);

	/**
	 * Visit a ExponentiationExpressionNode
	 */
	public void visit(ExponentiationExpressionNode node);

	/**
	 * Visit a FunctionExpressionNode
	 */
	public void visit(FunctionExpressionNode node);
}
