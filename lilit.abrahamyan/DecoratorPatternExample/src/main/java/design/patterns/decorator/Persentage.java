package design.patterns.decorator;

public class Persentage extends NumberDecorator {

	public Persentage(Number number) {
		super(number);
	}
	
	@Override
	public String getStringValue() {
		return this.getNumber().getStringValue() + "%";
	}

}
