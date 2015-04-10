package main.com.synisys.trainings.designPatterns;

public class Observer {
	public Observer(Model model){
		model.addChangeListener(this);
	}

	public void update(PropertyChangeEvent event) {
		System.out.println("Changed property: " + event.getProperty() + " [old -> "
			      + event.getOldValue() + "] | [new -> " + event.getNewValue() +"]");
		
	}	
}
