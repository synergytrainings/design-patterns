package impl;

public enum SystemLanguage {

	INSTANCE;
	
	SystemLanguage(){
		this.languageId = 1;//or get id from DB or file
		this.name = "English"; // or get name from DB or file
	}
	
	private int languageId;
	private String name;
	
	public int getLanguageId() {
		return languageId;
	}
	public String getName() {
		return name;
	}
	
	
	
}
