package design.patterns.visitor;

/**
 * 
 * @author lilit.abrahamyan
 *
 */
public interface Expression{
	
	int accept(ArithmeticExpressionVisitor visitor);	
}
