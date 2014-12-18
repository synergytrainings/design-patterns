package design.patterns.interpreter;

/**
 * Represents simple number (TerminalExpression)
 * @author lilit.abrahamyan
 *
 */
public class BasicNumber implements IExpression{

	private double value;

	public BasicNumber(double value) {
		this.value = value;
	}

	public BasicNumber(String s) {
		value = Double.parseDouble(s);
	}

	@Override
	public double getValue(Context context) {
		return Double.isNaN(value) && context.handleNANCase() ? 0 : value;
	}
	
}
