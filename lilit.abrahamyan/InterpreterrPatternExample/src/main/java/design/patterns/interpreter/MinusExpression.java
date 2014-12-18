package design.patterns.interpreter;


/**
 * Non-terminal expression
 * 
 * @author lilit.abrahamyan
 * 
 */
public class MinusExpression implements IExpression{

	private IExpression number1;
	private IExpression number2;

	public MinusExpression(IExpression number1, IExpression number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public double getValue(Context context) {
		return number1.getValue(context) - number2.getValue(context);
	}

}
