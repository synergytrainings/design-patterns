package com.synisys.training.patterns.visitor;

import com.synisys.training.patterns.parser.*;


public class ExpressionValidator extends AbstractVisitor {

	boolean isValid = true;
	private static final NodeVisitorResult<Object> VALID_RESULT = new NodeVisitorResultImpl<>(null, NodeVisitorResult.ResultStatus.CONTINUE);
	private static final NodeVisitorResult<Object> INVALID_RESULT = new NodeVisitorResultImpl<>(null, NodeVisitorResult.ResultStatus.TERMINATE);

	/**
	 * Validate divide by 0 case.
	 */
	@Override
	public NodeVisitorResult visit(MultiplicationExpressionNode node) {
		for (SequenceExpressionNode.Term term : node.getTerms()) {
			if (!term.positive && term.expression.getType() == ExpressionNode.CONSTANT_NODE) {
				Double value = ((ConstantExpressionNode) term.expression).getValue();
				if (value == 0.0) {
					isValid = false;
					break;
				}

			}else /*if(term.expression.getType() == ExpressionNode.FUNCTION_NODE)*/{
				 if(term.expression.accept(this) == INVALID_RESULT){
					 isValid = false;
					 break;
				 }
			}
		}
		return isValid ? VALID_RESULT : INVALID_RESULT;
	}

	public NodeVisitorResult visit(AdditionExpressionNode node) {
		for(SequenceExpressionNode.Term term : node.getTerms()){
			if(term.expression.accept(this) == INVALID_RESULT){
				this.isValid = false;
			}
		}
		return isValid ? VALID_RESULT : INVALID_RESULT;
	}

	public NodeVisitorResult visit(ExponentiationExpressionNode node) {
		boolean base =  node.getBase().accept(this) == INVALID_RESULT;
		boolean exponent = node.getExponent().accept(this) == INVALID_RESULT;
		isValid = !(base || exponent);
		return isValid ? VALID_RESULT : INVALID_RESULT;
	}


	public NodeVisitorResult visit(FunctionExpressionNode node) {
		isValid = node.getArgument().accept(this) != INVALID_RESULT;
		return isValid ? VALID_RESULT : INVALID_RESULT;
	}


	public boolean isValid() {
		return isValid;
	}

}
