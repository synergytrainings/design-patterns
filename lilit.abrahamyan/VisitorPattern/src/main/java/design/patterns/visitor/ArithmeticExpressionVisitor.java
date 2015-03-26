package design.patterns.visitor;

/**
 * @author lilit.abrahamyan
 *
 */
public interface ArithmeticExpressionVisitor{

	int visit(SumExpression expression);

	int visit(UnaryPlusExpression expression);
	
}