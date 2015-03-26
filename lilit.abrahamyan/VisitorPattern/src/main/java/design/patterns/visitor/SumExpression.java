package design.patterns.visitor;

/**
 * 
 * @author lilit.abrahamyan
 *
 */
public class SumExpression implements Expression{
	 
	private int leftOperand;
	private int rightOperand;
	

	public SumExpression(int leftOperand, int rightOperand) {
		super();
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	public int getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(int leftOperand) {
		this.leftOperand = leftOperand;
	}

	public int getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(int rightOperand) {
		this.rightOperand = rightOperand;
	}

	@Override
	public int accept(ArithmeticExpressionVisitor visitor) {
		return visitor.visit(this);
	}
     
}