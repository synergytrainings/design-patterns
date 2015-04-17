package main.com.synisys.trainings.designPattern;

import java.util.Calendar;
import java.util.List;

public class Project extends DeItemTemplate {
	private String title;
	private List<Location> deItemLocations;
	
	public Project(String prefix, String title, List<Location> deItemLocations) {
		super(prefix);
		this.title = title;
		this.deItemLocations = deItemLocations;
	}

	@Override
	public String getTitle() {
		if (this.title != null){
			return SEPARATOR + this.title;
		}else{
			return "";
		}
	}

	// not needed for Project
	@Override
	public String getLocationCode() {
		return "";
	}
	
	@Override
	public String getLocationsCount() {
		if (this.deItemLocations != null){
			return String.valueOf(this.deItemLocations.size());
		}else{
			return "";
		}
	}

	@Override
	public String getCurrentYear() {
		return String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
	}

}
