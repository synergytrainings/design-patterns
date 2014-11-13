package design.patterns.adapter.classadapter;

/**
 * Interface for unlocking the screen
 * 
 * @author lilit.abrahamyan
 *
 */
public interface  ScreenUnlock {

	/**
	 * Unlocks the screen
	 */
	public boolean unlockScreen();
	
	/**
	 * Returns authentication error
	 * @return authentication error
	 */
	public String getAuthenticationError();
	
}