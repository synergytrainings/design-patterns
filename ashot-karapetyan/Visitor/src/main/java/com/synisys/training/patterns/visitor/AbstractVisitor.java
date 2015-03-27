package com.synisys.training.patterns.visitor;

import com.synisys.training.patterns.parser.*;

/**
 * Created by Ashot Karapetyan on 3/27/2015.
 */
public abstract class AbstractVisitor<T> implements ExpressionNodeVisitor<T> {

	private static final NodeVisitorResult dummyResult = new NodeVisitorResultImpl<>(null, NodeVisitorResult.ResultStatus.CONTINUE);

	@Override
	public NodeVisitorResult<T> visit(VariableExpressionNode node) {
		return dummyResult;
	}

	@Override
	public NodeVisitorResult<T> visit(ConstantExpressionNode node) {
		return dummyResult;
	}

	@Override
	public NodeVisitorResult<T> visit(AdditionExpressionNode node) {
		return dummyResult;
	}

	@Override
	public NodeVisitorResult<T> visit(MultiplicationExpressionNode node) {
		return dummyResult;
	}

	@Override
	public NodeVisitorResult<T> visit(ExponentiationExpressionNode node) {
		return dummyResult;
	}

	@Override
	public NodeVisitorResult<T> visit(FunctionExpressionNode node) {
		return dummyResult;
	}
}
