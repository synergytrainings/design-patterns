package main.com.synisys.trainings.designPatterns;

import java.util.ArrayList;
import java.util.List;

public class Model {
	public static final String TITLE = "title";
	public static final String DESCRIPTION = "description";
	
	private Project project;
	private List<Observer> listeners = new ArrayList<>();
	  
	public void setTitle(String title) {
		notifyListeners(
		          TITLE,
		          project.getTitle(), 
		          title);
		project.setTitle(title);
	}
	
	public void setDescription(String description) {
		notifyListeners( 
		          DESCRIPTION,
		          project.getDescription(), 
		          description);
		project.setDescription(description);
	}
	
	public void addChangeListener(Observer observer) {
		listeners.add(observer);
	}
	
	public Project getProject(){
		return this.project;
	}
	
	public void setProject(Project project){
		this.project = project;
	}
	
	private void notifyListeners(String property, String oldValue, String newValue){
		for (Observer observer : this.listeners){
			observer.update(new PropertyChangeEvent(property, oldValue, newValue));
		}
	}		
}
