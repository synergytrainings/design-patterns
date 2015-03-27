package com.synisys.training.patterns.parser;

/**
 * An ExpressionNode that handles multiplications and divisions. The node can hold
 * an arbitrary number of factors that are either multiplied or divided to the product.
 */
public class MultiplicationExpressionNode extends SequenceExpressionNode {
	/**
	 * Default constructor.
	 */
	public MultiplicationExpressionNode() {
	}

	/**
	 * Constructor to create a multiplication with the first term already added.
	 *
	 * @param node     the term to be added
	 * @param positive a flag indicating whether the term is multiplied or divided
	 */
	public MultiplicationExpressionNode(ExpressionNode a, boolean positive) {
		super(a, positive);
	}

	/**
	 * Returns the type of the node, in this case ExpressionNode.MULTIPLICATION_NODE
	 */
	public int getType() {
		return MULTIPLICATION_NODE;
	}

	/**
	 * Implementation of the visitor design pattern.
	 * <p/>
	 * Calls visit on the visitor and then passes the visitor on to the accept
	 * method of all the terms in the product.
	 *
	 * @param visitor the visitor
	 */
	public NodeVisitorResult accept(ExpressionNodeVisitor visitor) {
		return  visitor.visit(this);
	}

}
