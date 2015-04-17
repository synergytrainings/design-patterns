package main.com.synisys.trainings.designPattern;

import java.util.List;

public class PipProject extends DeItemTemplate {
	private String title;
	private List<Location> deItemLocations;

	public PipProject(String prefix, String title,
			List<Location> deItemLocations) {
		super(prefix);
		this.title = title;
		this.deItemLocations = deItemLocations;
	}

	@Override
	public String getTitle() {
		if (this.title != null) {
			return SEPARATOR + this.title;
		} else {
			return "";
		}
	}

	@Override
	public String getLocationCode() {
		if (this.deItemLocations != null && this.deItemLocations.size() > 0) {
			return SEPARATOR + this.deItemLocations.get(0).getCode();
		} else {
			return "";
		}

	}

	// not needed for PipProject
	@Override
	public String getLocationsCount() {
		return "";
	}

	// not needed for PipProject
	@Override
	public String getCurrentYear() {
		return "";
	}

}
