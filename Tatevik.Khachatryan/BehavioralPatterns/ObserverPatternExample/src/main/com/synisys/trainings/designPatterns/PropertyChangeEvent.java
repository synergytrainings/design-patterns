package main.com.synisys.trainings.designPatterns;

public class PropertyChangeEvent {
	private String property;
	private String oldValue;
	private String newValue;
	
	public PropertyChangeEvent(String property, String oldValue, String newValue){
		this.property = property;
		this.oldValue = oldValue;
		this.newValue = newValue;				
	}

	public String getProperty() {
		return property;
	}

	public String getOldValue() {
		return oldValue;
	}

	public String getNewValue() {
		return newValue;
	}
}
