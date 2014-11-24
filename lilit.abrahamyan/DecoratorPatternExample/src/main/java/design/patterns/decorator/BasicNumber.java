package design.patterns.decorator;

public class BasicNumber implements Number{

	private int value;
	
	public BasicNumber(int value) {
		this.value = value;
	}

	@Override
	public String getStringValue() {
		return value + "";
	}
	
}
