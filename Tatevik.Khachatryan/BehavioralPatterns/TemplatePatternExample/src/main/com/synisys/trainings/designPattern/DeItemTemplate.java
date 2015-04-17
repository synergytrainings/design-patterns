package main.com.synisys.trainings.designPattern;

public abstract class DeItemTemplate {
	public final String SEPARATOR = "-";
	
	private String prefix;

	// private String title;
	// private List<Location> deItemLocations;
	//
	public DeItemTemplate(String prefix) {
		this.prefix = prefix;
	}

	// template method, final so subclasses can't override
	public final String generateCode() {
		StringBuilder code = new StringBuilder(getPrefix());
		code.append(getTitle());
		code.append(getLocationCode());
		code.append(getLocationsCount());
		code.append(getCurrentYear());
		return code.toString();
	}

	// default implementation
	private String getPrefix() {
		return this.prefix;
	}

	// methods to be implemented by subclasses
	public abstract String getTitle();

	public abstract String getLocationCode();
	
	public abstract String getLocationsCount();

	public abstract String getCurrentYear();
}
