package com.synisys.training.patterns.parser;

/**
 * An ExpressionNode that handles additions and subtractions. The node can hold
 * an arbitrary number of terms that are either added or subtraced from the sum.
 */
public class AdditionExpressionNode extends SequenceExpressionNode {

	/**
	 * Default constructor.
	 */
	public AdditionExpressionNode() {
	}

	/**
	 * Constructor to create an addition with the first term already added.
	 *
	 * @param node     the term to be added
	 * @param positive a flag indicating whether the term is added or subtracted
	 */
	public AdditionExpressionNode(ExpressionNode node, boolean positive) {
		super(node, positive);
	}

	/**
	 * Returns the type of the node, in this case ExpressionNode.ADDITION_NODE
	 */
	public int getType() {
		return ADDITION_NODE;
	}

	/**
	 * Implementation of the visitor design pattern.
	 * <p/>
	 * Calls visit on the visitor and then passes the visitor on to the accept
	 * method of all the terms in the sum.
	 *
	 * @param visitor the visitor
	 */
	public NodeVisitorResult<?> accept(ExpressionNodeVisitor visitor) {
		return visitor.visit(this);
	}

}
