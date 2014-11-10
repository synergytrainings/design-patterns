package impl;

public class SettingsMenu {
	
	private static SettingsMenu settingsMenu;
	
	private SettingsMenu(){
		//not allowed to create objects manually outside from class
	}

	public static synchronized SettingsMenu getInstance(){
		if(settingsMenu == null) {
			settingsMenu = new SettingsMenu();
		}
		return settingsMenu;
	}
}
