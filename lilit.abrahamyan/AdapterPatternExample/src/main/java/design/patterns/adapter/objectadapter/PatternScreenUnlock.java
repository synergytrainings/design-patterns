package design.patterns.adapter.objectadapter;
/**
 * Class responsible for unlock screen throw pattern
 * @author lilit.abrahamyan
 *
 */
public class PatternScreenUnlock implements ScreenUnlock{

	private GraphicalPattern graphicalPattern;
	
	public PatternScreenUnlock(){
		
	}
	
	PatternScreenUnlock(GraphicalPattern graphicalPattern){
		this.graphicalPattern = graphicalPattern;
	}
	
	@Override
	public boolean unlockScreen() {
		
		// Draws patter
		graphicalPattern.drawPattern();
		// ...
		//Compares patterns
		if (!graphicalPattern.comparePatterns()){
			System.out.print(getAuthenticationError());
			return false;
		}
		return true;
		
	}
	
	@Override
	public String getAuthenticationError() {
		return "Authentication Error : Pattern is not correct";
	}

}
