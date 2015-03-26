package design.patterns.visitor;

/**
 * 
 * @author lilit.abrahamyan
 *
 */
public class UnaryPlusExpression implements Expression{
	 
	private int operand;

	public UnaryPlusExpression(int operand) {
		super();
		this.operand = operand;
	}
	
	public int getOperand() {
		return operand;
	}

	public void setOperand(int operand) {
		this.operand = operand;
	}

	@Override
	public int accept(ArithmeticExpressionVisitor visitor) {
		return visitor.visit(this);
	}
     
}