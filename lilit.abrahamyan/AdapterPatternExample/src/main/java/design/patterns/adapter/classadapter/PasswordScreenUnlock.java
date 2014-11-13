package design.patterns.adapter.classadapter;

/**
 * Class for screen unlock by entering password
 * @author lilit.abrahamyan
 *
 */
public class PasswordScreenUnlock implements ScreenUnlock{

	@Override
	public boolean unlockScreen() {
		//Compares user's and input password to unlock the screen , if they are identical, unlocks the screen
		return false;
	}

	@Override
	public String getAuthenticationError() {
		return "Authentication Error : Password isn't correct";
	}
}
