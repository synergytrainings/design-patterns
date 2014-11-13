package design.patterns.adapter.classadapter;

public class SwipeScreenUnlock implements ScreenUnlock{

	@Override
	public boolean unlockScreen() {
		// Unlocks screen using swipe
		return false;
	}

	@Override
	public String getAuthenticationError() {
		return "Authentication Error swipe";
	}

}
