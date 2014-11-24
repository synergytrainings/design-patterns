package design.patterns.decorator;


/**
 * 
 * @author lilit.abrahamyan
 * 
 */
public class NumberDecorator implements Number {

	private Number number;

	public NumberDecorator(Number number) {
		this.number = number;
	}
	
	protected Number getNumber(){
		return this.number;
	}

	@Override
	public String getStringValue() {
		return this.number.getStringValue();
	}

}
