package com.synisys.training.patterns.interpreter.parser;

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
	 * Returns the value of the sub-expression that is rooted at this node.
	 * <p/>
	 * All the terms are evaluated and multiplied or divided to the product.
	 */
	public double getValue() {
		double prod = 1.0;
		for (Term t : terms) {
			if (t.positive)
				prod *= t.expression.getValue();
			else
				prod /= t.expression.getValue();
		}
		return prod;
	}

	/**
	 * Implementation of the visitor design pattern.
	 * <p/>
	 * Calls visit on the visitor and then passes the visitor on to the accept
	 * method of all the terms in the product.
	 *
	 * @param visitor the visitor
	 */
	public void accept(ExpressionNodeVisitor visitor) {
		visitor.visit(this);
		for (Term t : terms)
			t.expression.accept(visitor);
	}
}
