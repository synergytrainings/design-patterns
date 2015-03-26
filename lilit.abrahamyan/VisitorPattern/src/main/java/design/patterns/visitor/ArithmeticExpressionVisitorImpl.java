package design.patterns.visitor;

public class ArithmeticExpressionVisitorImpl implements
		ArithmeticExpressionVisitor {

	@Override
	public int visit(SumExpression expression) {
		int value = expression.getLeftOperand() + expression.getRightOperand();
		System.out.println(expression.getLeftOperand() + " + "
				+ expression.getRightOperand() + " = " + value);
		return value;
	}

	@Override
	public int visit(UnaryPlusExpression expression) {
		int value = expression.getOperand();
		System.out.println(" ++" + value + " = " + (++value));
		return value;
	}

}
