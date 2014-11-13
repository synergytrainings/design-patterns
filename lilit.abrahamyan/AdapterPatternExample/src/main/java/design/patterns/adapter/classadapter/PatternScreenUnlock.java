package design.patterns.adapter.classadapter;
/**
 * Class responsible for unlock screen throw pattern
 * @author lilit.abrahamyan
 *
 */
public class PatternScreenUnlock extends GraphicalPattern implements ScreenUnlock{

	@Override
	public boolean unlockScreen() {
		
		// Draws patter
		drawPattern();
		// ...
		//Compares patterns
		if (!comparePatterns()){
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
