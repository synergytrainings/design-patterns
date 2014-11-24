package design.patterns.decorator;

public class Currency extends NumberDecorator {

	public Currency(Number number) {
		super(number);
	}
	
	@Override
	public String getStringValue() {
		return this.getNumber().getStringValue() + "$";
	}

}
