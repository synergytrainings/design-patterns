package design.patterns.interpreter;

public class Context {

	private boolean handleNANCase;
	
	public Context (boolean handleNANCase){
		this.handleNANCase = handleNANCase;
	}
	
	public boolean handleNANCase() {
		return handleNANCase;
	}
	
	public boolean setHandleNANCase() {
		return handleNANCase;
	}

}
